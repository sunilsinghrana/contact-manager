package com.example.phonemanager.domain.usecase.update_contact

import com.example.phonemanager.domain.entity.ContactEntity
import com.example.phonemanager.domain.repository.ContactRepository
import javax.inject.Inject

class UpdateContactUseCaseImpl {
    class UpdateContactUseCaseImpl @Inject constructor(private val contactRepository: ContactRepository) :
        UpdateContactUseCase {
        override suspend fun invoke(contact: ContactEntity) {
            contactRepository.updateContact(contact)
        }
    }
}