package com.example.phonemanager.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.phonemanager.domain.entity.ContactEntity

@Database(entities = [ContactEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactDao
}