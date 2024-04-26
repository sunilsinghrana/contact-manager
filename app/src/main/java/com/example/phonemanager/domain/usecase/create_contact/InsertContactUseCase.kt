package com.example.phonemanager.domain.usecase.create_contact

import com.example.phonemanager.domain.entity.ContactEntity

interface InsertContactUseCase {
    suspend operator fun invoke(contact: ContactEntity)
}