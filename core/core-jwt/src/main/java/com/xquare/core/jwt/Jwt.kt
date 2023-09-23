package com.xquare.core.jwt

import org.koin.java.KoinJavaComponent.get

val accessToken: AccessToken
	inline get() =
		get(
			clazz = String::class.java,
			qualifier = JwtDiQualifier.ACCESS_TOKEN,
		)

val accessTokenExpiration: AccessTokenExpiration
	inline get() =
		get(
			clazz = String::class.java,
			qualifier = JwtDiQualifier.ACCESS_TOKEN_EXPIRATION,
		)

val refreshToken: RefreshToken
	inline get() =
		get(
			clazz = String::class.java,
			qualifier = JwtDiQualifier.REFRESH_TOKEN,
		)

val refreshTokenExpiration: RefreshTokenExpiration
	inline get() =
		get(
			clazz = String::class.java,
			qualifier = JwtDiQualifier.REFRESH_TOKEN_EXPIRATION,
		)
