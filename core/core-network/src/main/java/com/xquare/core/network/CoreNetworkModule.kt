package com.xquare.core.network

import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module

object NetworkDiQualifier {
    val HTTP_CLIENT_DEFAULT = named("http-client-default")
    val HTTP_CLIENT_DEBUG = named("http-client-debug")
}

val coreNetworkModule: Module
    get() = module {
        includes(httpClientModule)
    }

private val httpClientModule: Module
    inline get() = module {

    }
