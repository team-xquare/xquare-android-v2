package com.xquare.core.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json

internal val defaultHttpClient = HttpClient(CIO) {
    expectSuccess = true

    install(ContentNegotiation) { json() }

    if (
    /* is debug mode enabled */
        true
    ) {
        install(Logging)
    }

    defaultRequest {
        contentType(ContentType.Application.Json)
        /* base url */
        /*
        url()
         */
    }
}
