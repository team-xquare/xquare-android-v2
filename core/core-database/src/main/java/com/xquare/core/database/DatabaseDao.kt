package com.xquare.core.database

import kotlinx.coroutines.flow.Flow

abstract class DatabaseDao<E : DatabaseEntity> {
    abstract fun findAll(): Flow<List<E>>
    abstract fun upsert(entity: E)
    abstract fun delete(entity: E)
    abstract fun deleteAll()
}
