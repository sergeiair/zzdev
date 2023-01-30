package com.zzdev.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform