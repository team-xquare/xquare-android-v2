package com.xquare.core.jwt.store

import com.xquare.core.jwt.AccessToken
import com.xquare.core.jwt.AccessTokenExpiration
import com.xquare.core.jwt.RefreshToken
import com.xquare.core.jwt.RefreshTokenExpiration
import kotlinx.coroutines.flow.Flow

internal abstract class JwtStore {
    abstract fun loadAccessToken(): Flow<AccessToken>
    abstract fun loadAccessTokenExpiration(): Flow<AccessTokenExpiration>
    abstract fun loadRefreshToken(): Flow<RefreshToken>
    abstract fun loadRefreshTokenExpiration(): Flow<RefreshTokenExpiration>
}
