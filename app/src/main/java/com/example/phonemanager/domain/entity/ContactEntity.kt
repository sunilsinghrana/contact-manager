package com.example.phonemanager.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts_table")
data class ContactEntity(
    @ColumnInfo(name = "contact_id")
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,

    @ColumnInfo(name = "contact_name")
    val name: String? = null,

    @ColumnInfo(name = "contact_surname")
    val surname: String? = null,

    @ColumnInfo(name = "contact_phone")
    val phone: String,

    @ColumnInfo(name = "contact_email")
    val email: String
)
