package com.xquare.core.database

import kotlinx.coroutines.flow.Flow

internal interface DatabaseDao<E : DatabaseEntity> {
    fun findAll(): List<Flow<E>>
    fun upsert(entity: E)
    fun delete(entity: E)
    fun deleteAll()
}
