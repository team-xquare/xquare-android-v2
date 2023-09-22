package com.xquare.core.jwt

import com.xquare.core.di.DiQualifier
import com.xquare.core.jwt.network.tokenReissueHttpClient
import com.xquare.core.jwt.store.JwtStore
import com.xquare.core.jwt.store.JwtStoreImpl
import io.ktor.client.HttpClient
import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module

object JwtDiQualifier : DiQualifier() {
    val HTTP_CLIENT_TOKEN_REISSUE = named("http-client-token-reissue")

    val ACCESS_TOKEN = named("access-token")
    val ACCESS_TOKEN_EXPIRATION = named("access-token-expiration")
    val REFRESH_TOKEN = named("refresh-token")
    val REFRESH_TOKEN_EXPIRATION = named("refresh-token-expiration")
}

val coreJwtModule: Module
    get() = module {
        includes(tokenModule)

        single<HttpClient>(qualifier = JwtDiQualifier.HTTP_CLIENT_TOKEN_REISSUE) { tokenReissueHttpClient }
        single<JwtStore> { JwtStoreImpl(get()) }
    }

private val tokenModule: Module
    inline get() = module {
        factory<AccessToken>(qualifier = JwtDiQualifier.ACCESS_TOKEN) {
            get<JwtStore>().loadAccessToken()
        }
        factory<AccessTokenExpiration>(qualifier = JwtDiQualifier.ACCESS_TOKEN_EXPIRATION) {
            get<JwtStore>().loadAccessTokenExpiration()
        }
        factory<RefreshToken>(qualifier = JwtDiQualifier.REFRESH_TOKEN) {
            get<JwtStore>().loadRefreshToken()
        }
        factory<RefreshTokenExpiration> {
            get<JwtStore>().loadRefreshTokenExpiration()
        }
    }
