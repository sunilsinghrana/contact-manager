package com.example.phonemanager.domain.usecase.read_contact

import com.example.phonemanager.common.ResponseStateHandle
import com.example.phonemanager.domain.entity.ContactEntity
import com.example.phonemanager.domain.repository.ContactRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetContactsUseCaseImpl @Inject constructor(private val contactRepository: ContactRepository) : GetContactsUseCase {
    override suspend fun invoke(): Flow<ResponseStateHandle<List<ContactEntity>>> {
        return contactRepository.getAllContacts()
    }
}