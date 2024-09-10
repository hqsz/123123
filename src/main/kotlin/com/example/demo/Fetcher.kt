package com.example.demo

class Fetcher(
    private val data: Data?
) {
    data class Data(
        val num: Int,
    )

    fun get(): Data? {
        return data
    }
}