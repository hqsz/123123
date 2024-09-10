package com.example.demo

class TestService(
    private val fetcher: Fetcher,
): ActionInterface {
    override fun action(message: Message) {
        val nullableVal = fetcher.get()

        when (message.status) {
            Message.Status.UPSERT -> {
                if (nullableVal != null) {
                    println()
                } else {
                    println()
                }
            }
            Message.Status.DELETE -> {
                if (nullableVal != null) {
                    println()
                }
            }
        }
    }
}