package com.example.phonemanager.data.datasource

import com.example.phonemanager.common.ResponseStateHandle
import com.example.phonemanager.data.database.ContactDao
import com.example.phonemanager.domain.entity.ContactEntity
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(private val contactDao: ContactDao) :
    LocalDataSource {
    override suspend fun insertContact(contact: ContactEntity) {
        contactDao.insertContact(contact)
    }

    override suspend fun deleteContact(contact: ContactEntity) {
        contactDao.deleteContact(contact)
    }

    override suspend fun updateContact(contact: ContactEntity) {
        contactDao.updateContact(contact)
    }

    override suspend fun getAllContacts(): ResponseStateHandle<List<ContactEntity>> {
        return try {
            ResponseStateHandle.Loading
            ResponseStateHandle.Success(contactDao.getAllContacts())
        } catch (e: Exception) {
            ResponseStateHandle.Error(e)
        }
    }
}