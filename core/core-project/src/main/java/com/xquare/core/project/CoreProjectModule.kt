package com.xquare.core.project

import com.xquare.core.di.DiQualifier
import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module

object ProjectDiQualifier : DiQualifier() {
    val IS_DEBUG_ENABLED = named("is-debug-enabled")
}

val coreProjectModule: Module
    get() = module {
        single<Boolean>(qualifier = ProjectDiQualifier.IS_DEBUG_ENABLED) {
            BuildConfig.DEBUG
        }
    }
