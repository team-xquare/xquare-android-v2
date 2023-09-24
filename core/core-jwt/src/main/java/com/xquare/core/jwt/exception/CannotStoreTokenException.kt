package com.xquare.core.jwt.exception

import com.xquare.core.datastore.exception.TransformFailureException

sealed class CannotStoreTokenException(message: String?) : TransformFailureException(message)

class CannotStoreAccessTokenException : CannotStoreTokenException("Cannot store access token")

class CannotStoreRefreshTokenException : CannotStoreTokenException("Cannot store refresh token")
