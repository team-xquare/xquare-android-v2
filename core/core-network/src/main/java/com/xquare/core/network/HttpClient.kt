package com.xquare.core.network

import io.ktor.client.HttpClient
import org.koin.java.KoinJavaComponent.get

val debugHttpClient: DebugHttpClient
    inline get() = get(
        clazz = HttpClient::class.java,
        qualifier = NetworkDiQualifier.HTTP_CLIENT_DEBUG,
    )

val defaultHttpClient: DefaultHttpClient
    inline get() = get(
        clazz = HttpClient::class.java,
        qualifier = NetworkDiQualifier.HTTP_CLIENT_DEFAULT,
    )
