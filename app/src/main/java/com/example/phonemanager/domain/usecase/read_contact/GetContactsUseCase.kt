package com.example.phonemanager.domain.usecase.read_contact

import com.example.phonemanager.common.ResponseStateHandle
import com.example.phonemanager.domain.entity.ContactEntity
import kotlinx.coroutines.flow.Flow

interface GetContactsUseCase {
    suspend operator fun invoke(): Flow<ResponseStateHandle<List<ContactEntity>>>
}