package com.example.phonemanager.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.phonemanager.domain.entity.ContactEntity

@Dao
interface ContactDao {

    @Insert
    fun insertContact(contact: ContactEntity)

    @Delete
    fun deleteContact(contact: ContactEntity)

    @Update
    fun updateContact(contact: ContactEntity)

    @Query("SELECT * FROM contacts_table")
    fun getAllContacts(): List<ContactEntity>
}