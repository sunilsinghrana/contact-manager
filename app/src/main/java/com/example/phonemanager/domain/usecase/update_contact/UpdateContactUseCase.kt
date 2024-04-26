package com.example.phonemanager.domain.usecase.update_contact

import com.example.phonemanager.domain.entity.ContactEntity

interface UpdateContactUseCase {
    suspend operator fun invoke(contact: ContactEntity)
}