package com.xquare.core.network.httpclient

import com.xquare.core.network.NetworkDiQualifier
import io.ktor.client.HttpClient
import org.koin.java.KoinJavaComponent.get

internal val debugHttpClient =
	get<HttpClient>(
		clazz = HttpClient::class.java,
		qualifier = NetworkDiQualifier.HTTP_CLIENT_DEFAULT,
	).config {
		// TODO: make debug client
	}
