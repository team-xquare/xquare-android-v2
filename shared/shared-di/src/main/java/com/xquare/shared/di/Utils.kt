package com.xquare.shared.di

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

inline fun <reified T> get(): T = object : KoinComponent {
    val value: T by inject()
}.value
