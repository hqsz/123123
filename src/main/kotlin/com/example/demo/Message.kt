package com.example.demo

data class Message(
    val status: Status,
) {
    enum class Status {
        UPSERT,
        DELETE,
        ;
    }
}