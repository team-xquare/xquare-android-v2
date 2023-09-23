package com.xquare.core.jwt.store

import com.xquare.core.jwt.AccessToken
import com.xquare.core.jwt.AccessTokenExpiration
import com.xquare.core.jwt.RefreshToken
import com.xquare.core.jwt.RefreshTokenExpiration

internal abstract class JwtStore {
	abstract fun loadAccessToken(): AccessToken

	abstract fun loadAccessTokenExpiration(): AccessTokenExpiration

	abstract fun loadRefreshToken(): RefreshToken

	abstract fun loadRefreshTokenExpiration(): RefreshTokenExpiration
}
