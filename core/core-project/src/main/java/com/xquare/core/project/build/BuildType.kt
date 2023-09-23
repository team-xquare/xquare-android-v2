package com.xquare.core.project.build

enum class BuildType(
    val value: String,
) {
    DEBUG("debug"), RELEASE("release"),
    ;

    companion object {
        fun fromString(value: String) = when (value) {
            "debug" -> DEBUG
            "release" -> RELEASE
            else -> throw IllegalArgumentException()
        }
    }
}
