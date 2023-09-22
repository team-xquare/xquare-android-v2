package com.xquare.core.jwt.store

import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.xquare.core.datastore.PreferencesDataStore
import com.xquare.core.jwt.AccessToken
import com.xquare.core.jwt.AccessTokenExpiration
import com.xquare.core.jwt.RefreshToken
import com.xquare.core.jwt.RefreshTokenExpiration
import com.xquare.core.jwt.exception.AccessTokenExpirationNotFoundException
import com.xquare.core.jwt.exception.AccessTokenNotFoundException
import com.xquare.core.jwt.exception.RefreshTokenExpirationNotFoundException
import com.xquare.core.jwt.exception.RefreshTokenNotFoundException
import com.xquare.shared.date.toLocalDateTime
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

internal class JwtStoreImpl(
    private val preferencesDataStore: PreferencesDataStore,
) : JwtStore() {
    override suspend fun loadAccessToken(): AccessToken =
        preferencesDataStore.data.map { preferences ->
            preferences[ACCESS_TOKEN] ?: throw AccessTokenNotFoundException()
        }.first()

    override suspend fun loadAccessTokenExpiration(): AccessTokenExpiration =
        preferencesDataStore.data.map { preferences ->
            val longValue = preferences[ACCESS_TOKEN_EXPIRATION]
                ?: throw AccessTokenExpirationNotFoundException()

            return@map longValue.toLocalDateTime()
        }.first()

    override suspend fun loadRefreshToken(): RefreshToken =
        preferencesDataStore.data.map { preferences ->
            preferences[REFRESH_TOKEN] ?: throw RefreshTokenNotFoundException()
        }.first()

    override suspend fun loadRefreshTokenExpiration(): RefreshTokenExpiration =
        preferencesDataStore.data.map { preferences ->
            val longValue = preferences[REFRESH_TOKEN_EXPIRATION]
                ?: throw RefreshTokenExpirationNotFoundException()

            return@map longValue.toLocalDateTime()
        }.first()

    private companion object {
        val ACCESS_TOKEN = stringPreferencesKey("access-token")
        val ACCESS_TOKEN_EXPIRATION = longPreferencesKey("access-token-expiration")
        val REFRESH_TOKEN = stringPreferencesKey("refresh-token")
        val REFRESH_TOKEN_EXPIRATION = longPreferencesKey("refresh-token-expiration")
    }
}
