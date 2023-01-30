package com.zzdev.app

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    private val platform: Platform = getPlatform()

    private val client = HttpClient()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    suspend fun greeting(): String {
        val response = client.get("https://ktor.io/docs/")
        return response.bodyAsText()
    }
}