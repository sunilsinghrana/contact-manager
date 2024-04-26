package com.example.phonemanager.data.repository

import com.example.phonemanager.common.ResponseStateHandle
import com.example.phonemanager.data.datasource.LocalDataSource
import com.example.phonemanager.di.coroutine.IoDispatcher
import com.example.phonemanager.domain.entity.ContactEntity
import com.example.phonemanager.domain.repository.ContactRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ContactRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
) : ContactRepository{
    override suspend fun insertContact(contact: ContactEntity) {
        localDataSource.insertContact(contact)
    }

    override suspend fun deleteContact(contact: ContactEntity) {
        localDataSource.deleteContact(contact)
    }

    override suspend fun updateContact(contact: ContactEntity) {
        localDataSource.updateContact(contact)
    }

//    fun getSelectedNote(noteId: Int): Flow<ContactEntity> {
//        return localDataSource.getSelectedNote(noteId = noteId)
//    }

    override suspend fun getAllContacts(): Flow<ResponseStateHandle<List<ContactEntity>>> {
        return flow {
            emit(ResponseStateHandle.Loading)
            when (val response = localDataSource.getAllContacts()) {
                is ResponseStateHandle.Success -> {
                    emit(ResponseStateHandle.Success(response.result))
                }
                ResponseStateHandle.Loading -> {
                    emit(ResponseStateHandle.Loading)
                }
                is ResponseStateHandle.Error -> {
                    emit(ResponseStateHandle.Error(response.exception))
                }
            }

        }.flowOn(ioDispatcher)
    }
}