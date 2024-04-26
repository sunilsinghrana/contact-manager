package com.example.phonemanager.data.datasource

import com.example.phonemanager.common.ResponseStateHandle
import com.example.phonemanager.domain.entity.ContactEntity

interface LocalDataSource {
    suspend fun insertContact(contact: ContactEntity)

    suspend fun deleteContact(contact: ContactEntity)

    suspend fun updateContact(contact: ContactEntity)

    suspend fun getAllContacts(): ResponseStateHandle<List<ContactEntity>>

}