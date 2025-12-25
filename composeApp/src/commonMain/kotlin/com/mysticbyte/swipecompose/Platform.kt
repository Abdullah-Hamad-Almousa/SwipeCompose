package com.mysticbyte.swipecompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform