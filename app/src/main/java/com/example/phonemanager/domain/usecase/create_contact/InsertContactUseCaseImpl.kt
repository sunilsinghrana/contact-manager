package com.example.phonemanager.domain.usecase.create_contact

import com.example.phonemanager.domain.entity.ContactEntity
import com.example.phonemanager.domain.repository.ContactRepository
import javax.inject.Inject

class InsertContactUseCaseImpl @Inject constructor(private val contactRepository: ContactRepository) :
    InsertContactUseCase {
    override suspend fun invoke(contact: ContactEntity) {
        contactRepository.insertContact(contact)
    }
}