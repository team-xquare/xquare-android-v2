package com.xquare.core.jwt.network

import com.xquare.core.network.NetworkDiQualifier
import io.ktor.client.HttpClient
import org.koin.java.KoinJavaComponent.get

val tokenReissueHttpClient = get<HttpClient>(
    clazz = HttpClient::class.java,
    qualifier = NetworkDiQualifier.HTTP_CLIENT_DEFAULT,
).config {

}

