package com.example.phonemanager.domain.repository

import com.example.phonemanager.domain.entity.ContactEntity
import kotlinx.coroutines.flow.Flow
import com.example.phonemanager.common.ResponseStateHandle

interface ContactRepository {
    suspend fun insertContact(contact: ContactEntity)
    suspend fun deleteContact(contact: ContactEntity)
    suspend fun updateContact(contact: ContactEntity)
    suspend fun getAllContacts(): Flow<ResponseStateHandle<List<ContactEntity>>>
}