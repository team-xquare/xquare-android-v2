package com.xquare.core.jwt.store

import com.xquare.core.jwt.AccessToken
import com.xquare.core.jwt.AccessTokenExpiration
import com.xquare.core.jwt.RefreshToken
import com.xquare.core.jwt.RefreshTokenExpiration

internal abstract class JwtStore {
    abstract suspend fun loadAccessToken(): AccessToken
    abstract suspend fun loadAccessTokenExpiration(): AccessTokenExpiration
    abstract suspend fun loadRefreshToken(): RefreshToken
    abstract suspend fun loadRefreshTokenExpiration(): RefreshTokenExpiration
}
