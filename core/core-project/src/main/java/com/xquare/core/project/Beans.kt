package com.xquare.core.project

import org.koin.java.KoinJavaComponent.get

val isDebugEnabled: Boolean
    inline get() = get(
        clazz = Boolean::class.java,
        qualifier = ProjectDiQualifier.IS_DEBUG_ENABLED,
    )
