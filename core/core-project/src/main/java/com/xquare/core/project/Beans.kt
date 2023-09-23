package com.xquare.core.project

import com.xquare.core.project.build.BuildType
import com.xquare.shared.di.get
import org.koin.java.KoinJavaComponent.get

val isDebugEnabled: Boolean
	inline get() =
		get(
			clazz = Boolean::class.java,
			qualifier = ProjectDiQualifier.IS_DEBUG_ENABLED,
		)

val buildType: BuildType
	inline get() = get<BuildType>()
