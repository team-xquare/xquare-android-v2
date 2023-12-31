package com.xquare.core.network

import com.xquare.core.di.DiQualifier
import com.xquare.core.network.httpclient.debugHttpClient
import com.xquare.core.network.httpclient.defaultHttpClient
import io.ktor.client.HttpClient
import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module

object NetworkDiQualifier : DiQualifier() {
	val HTTP_CLIENT_DEFAULT = named("http-client-default")
	val HTTP_CLIENT_DEBUG = named("http-client-debug")
}

val coreNetworkModule: Module
	get() =
		module {
			includes(httpClientModule)
		}

private val httpClientModule: Module
	inline get() =
		module {
			single<HttpClient>(qualifier = NetworkDiQualifier.HTTP_CLIENT_DEFAULT) { defaultHttpClient }
			single<HttpClient>(qualifier = NetworkDiQualifier.HTTP_CLIENT_DEBUG) { debugHttpClient }
		}
