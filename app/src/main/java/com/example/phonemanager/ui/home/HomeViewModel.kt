package com.example.phonemanager.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phonemanager.common.ResponseStateHandle
import com.example.phonemanager.di.coroutine.IoDispatcher
import com.example.phonemanager.domain.entity.ContactEntity
import com.example.phonemanager.domain.repository.ContactRepository
import com.example.phonemanager.domain.usecase.read_contact.GetContactsUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val getContactsUseCase: GetContactsUseCase,
    private val contactRepository: ContactRepository,
    @IoDispatcher private val ioDispatcher : CoroutineDispatcher = Dispatchers.IO
) : ViewModel(){

    private val _allContacts = MutableLiveData<ResponseStateHandle<List<ContactEntity>>>()
    val allContacts : LiveData<ResponseStateHandle<List<ContactEntity>>> get() = _allContacts

    fun getAllContacts() {
        viewModelScope.launch(ioDispatcher) {
            getContactsUseCase().collect() {
                when (it) {
                    is ResponseStateHandle.Success -> _allContacts.postValue(ResponseStateHandle.Success(it.result))
                    is ResponseStateHandle.Error -> _allContacts.postValue(ResponseStateHandle.Error(it.exception))
                    ResponseStateHandle.Loading -> _allContacts.postValue(ResponseStateHandle.Loading)
                }
            }
        }
    }

    fun getSelectedNote(noteId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            contactRepository.getSelectedNote(noteId = noteId).collect { note ->
                _selectedNote.value = note
            }
        }
    }
}