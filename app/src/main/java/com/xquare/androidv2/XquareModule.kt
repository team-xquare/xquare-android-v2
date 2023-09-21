package com.xquare.androidv2

import com.xquare.core.database.coreDatabaseModule
import org.koin.core.module.Module
import org.koin.dsl.module

internal val xquareModule: Module
    get() = module {
        includes(
            coreModule,
            dataModule,
            databaseModule,
            dataStoreModule,
            domainModule,
            networkModule,
        )
    }

private val coreModule: Module
    inline get() = module {
        includes(coreDatabaseModule)
    }

private val dataModule: Module
    inline get() = module {
        includes()
    }

private val databaseModule: Module
    inline get() = module {
        includes()
    }

private val dataStoreModule: Module
    inline get() = module {
        includes()
    }

private val domainModule: Module
    inline get() = module {
        includes()
    }

private val networkModule: Module
    inline get() = module {
        includes()
    }
