package com.example.phonemanager.domain.usecase.delete_contact

import com.example.phonemanager.domain.entity.ContactEntity
import com.example.phonemanager.domain.repository.ContactRepository
import javax.inject.Inject

class DeleteContactUseCaseImpl @Inject constructor(private val contactRepository: ContactRepository) : DeleteContactUseCase {
    override suspend fun invoke(contact: ContactEntity) {
        contactRepository.deleteContact(contact)
    }
}