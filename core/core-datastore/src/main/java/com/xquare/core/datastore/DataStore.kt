package com.xquare.core.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

internal val Context.preferencesDataStore: DataStore<Preferences> by preferencesDataStore(name = "datastore-preferences-xquare")
