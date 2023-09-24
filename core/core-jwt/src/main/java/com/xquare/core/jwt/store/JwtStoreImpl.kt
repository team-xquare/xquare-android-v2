package com.xquare.core.jwt.store

import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.xquare.core.datastore.PreferencesDataStore
import com.xquare.core.datastore.transform
import com.xquare.core.jwt.AccessToken
import com.xquare.core.jwt.AccessTokenExpiration
import com.xquare.core.jwt.RefreshToken
import com.xquare.core.jwt.RefreshTokenExpiration
import com.xquare.core.jwt.exception.AccessTokenExpirationNotFoundException
import com.xquare.core.jwt.exception.AccessTokenNotFoundException
import com.xquare.core.jwt.exception.CannotStoreAccessTokenException
import com.xquare.core.jwt.exception.CannotStoreAccessTokenExpirationException
import com.xquare.core.jwt.exception.CannotStoreRefreshTokenException
import com.xquare.core.jwt.exception.CannotStoreRefreshTokenExpirationException
import com.xquare.core.jwt.exception.RefreshTokenExpirationNotFoundException
import com.xquare.core.jwt.exception.RefreshTokenNotFoundException
import com.xquare.shared.date.toEpochMillis
import com.xquare.shared.date.toLocalDateTime
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

internal class JwtStoreImpl(
	private val preferencesDataStore: PreferencesDataStore,
) : JwtStore() {
	override fun loadAccessToken(): AccessToken = runBlocking {
		preferencesDataStore.data.map { preferences ->
			preferences[ACCESS_TOKEN] ?: throw AccessTokenNotFoundException()
		}.first()
	}

	override suspend fun storeAccessToken(token: AccessToken) {
		transform(
			job = {
				preferencesDataStore.edit { preferences ->
					preferences[ACCESS_TOKEN] = token
				}
			},
			onFailure = { throw CannotStoreAccessTokenException() },
		)
	}

	override fun loadAccessTokenExpiration(): AccessTokenExpiration = runBlocking {
		preferencesDataStore.data.map { preferences ->
			val longValue = preferences[ACCESS_TOKEN_EXPIRATION]
				?: throw AccessTokenExpirationNotFoundException()

			return@map longValue.toLocalDateTime()
		}.first()
	}

	override suspend fun storeAccessTokenExpiration(expiration: AccessTokenExpiration) {
		transform(
			job = {
				preferencesDataStore.edit { preferences ->
					preferences[ACCESS_TOKEN_EXPIRATION] = expiration.toEpochMillis()
				}
			},
			onFailure = { throw CannotStoreAccessTokenExpirationException() },
		)
	}

	override fun loadRefreshToken(): RefreshToken = runBlocking {
		preferencesDataStore.data.map { preferences ->
			preferences[REFRESH_TOKEN] ?: throw RefreshTokenNotFoundException()
		}.first()
	}

	override suspend fun storeRefreshToken(token: RefreshToken) {
		transform(
			job = {
				preferencesDataStore.edit { preferences ->
					preferences[REFRESH_TOKEN] = token
				}
			},
			onFailure = { throw CannotStoreRefreshTokenException() },
		)
	}

	override fun loadRefreshTokenExpiration(): RefreshTokenExpiration = runBlocking {
		preferencesDataStore.data.map { preferences ->
			val longValue = preferences[REFRESH_TOKEN_EXPIRATION]
				?: throw RefreshTokenExpirationNotFoundException()

			return@map longValue.toLocalDateTime()
		}.first()
	}

	override suspend fun storeRefreshTokenExpiration(expiration: RefreshTokenExpiration) {
		transform(
			job = {
				preferencesDataStore.edit { preferences ->
					preferences[REFRESH_TOKEN_EXPIRATION] = expiration.toEpochMillis()
				}
			},
			onFailure = { throw CannotStoreRefreshTokenExpirationException() },
		)
	}

	private companion object {
		val ACCESS_TOKEN = stringPreferencesKey("access-token")
		val ACCESS_TOKEN_EXPIRATION = longPreferencesKey("access-token-expiration")
		val REFRESH_TOKEN = stringPreferencesKey("refresh-token")
		val REFRESH_TOKEN_EXPIRATION = longPreferencesKey("refresh-token-expiration")
	}
}
