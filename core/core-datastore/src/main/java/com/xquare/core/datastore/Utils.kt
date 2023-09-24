package com.xquare.core.datastore

import com.xquare.core.datastore.exception.TransformFailureException

suspend inline fun <reified T> transform(
	crossinline job: suspend () -> T,
	onSuccess: (T) -> Unit = {},
	onFailure: (Throwable) -> Unit = { throw TransformFailureException() },
) = runCatching { job() }
	.onSuccess(onSuccess)
	.onFailure(onFailure)
	.getOrThrow()
