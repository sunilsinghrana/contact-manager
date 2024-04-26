package com.example.phonemanager.domain.usecase.delete_contact

import com.example.phonemanager.domain.entity.ContactEntity

interface DeleteContactUseCase {
    suspend operator fun invoke(contact: ContactEntity)
}