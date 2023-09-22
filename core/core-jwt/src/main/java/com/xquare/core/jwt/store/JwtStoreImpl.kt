package com.xquare.core.jwt.store

import com.xquare.core.datastore.PreferencesDataStore

internal class JwtStoreImpl(
    private val preferencesDataStore: PreferencesDataStore,
) : JwtStore()
