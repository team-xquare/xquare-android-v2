package com.xquare.androidv2

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class XquareApplication : Application() {
	override fun onCreate() {
		super.onCreate()
		startKoin {
			androidContext(this@XquareApplication)
			androidLogger()
			modules(xquareModule)
		}
	}
}
