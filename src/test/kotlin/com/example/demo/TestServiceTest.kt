package com.example.demo

import io.kotest.assertions.throwables.shouldNotThrowAny
import org.junit.jupiter.api.Test

class TestServiceTest {

    @Test
    fun test1() {
        TestService(
            fetcher = Fetcher(
                data = Fetcher.Data(1)
            ),
        ).action(
            message = Message(
                status = Message.Status.UPSERT,
            )
        )
    }

    @Test
    fun test2() {
        TestService(
            fetcher = Fetcher(
                data = null
            ),
        ).action(
            message = Message(
                status = Message.Status.UPSERT,
            )
        )
    }

    @Test
    fun test3() {
        val testService = TestService(
            fetcher = Fetcher(
                data = null
            ),
        )

        shouldNotThrowAny {
            testService.action(
                message = Message(
                    status = Message.Status.DELETE,
                )
            )
        }

    }
}