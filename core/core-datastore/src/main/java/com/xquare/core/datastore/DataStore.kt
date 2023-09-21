package com.xquare.core.datastore

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

internal val Context.preferencesDataStore: PreferencesDataStore by preferencesDataStore(name = "datastore-preferences-xquare")
