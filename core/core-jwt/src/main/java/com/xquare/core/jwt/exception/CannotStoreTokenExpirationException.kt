package com.xquare.core.jwt.exception

import com.xquare.core.datastore.exception.TransformFailureException

sealed class CannotStoreTokenExpirationException(message: String?) :
	TransformFailureException(message)

class CannotStoreAccessTokenExpirationException :
	CannotStoreTokenExpirationException("Cannot store access token expiration")

class CannotStoreRefreshTokenExpirationException :
	CannotStoreTokenExpirationException("Cannot store refresh token expiration")
