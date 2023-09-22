package com.xquare.androidv2

import com.xquare.core.database.coreDatabaseModule
import com.xquare.core.datastore.coreDataStoreModule
import com.xquare.core.jwt.coreJwtModule
import com.xquare.core.network.coreNetworkModule
import com.xquare.data.meal.dataMealModule
import com.xquare.database.meal.databaseMealModule
import com.xquare.datastore.meal.dataStoreMealModule
import com.xquare.domain.meal.domainMealModule
import com.xquare.network.meal.networkMealModule
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
        includes(
            coreDatabaseModule,
            coreDataStoreModule,
            coreJwtModule,
            coreNetworkModule,
        )
    }

private val dataModule: Module
    inline get() = module {
        includes(
            dataMealModule,
        )
    }

private val databaseModule: Module
    inline get() = module {
        includes(
            databaseMealModule,
        )
    }

private val dataStoreModule: Module
    inline get() = module {
        includes(
            dataStoreMealModule,
        )
    }

private val domainModule: Module
    inline get() = module {
        includes(
            domainMealModule,
        )
    }

private val networkModule: Module
    inline get() = module {
        includes(
            networkMealModule,
        )
    }
