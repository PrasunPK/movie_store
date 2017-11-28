package com.basic.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SimpleApi

    fun main(args: Array<String>) {
        SpringApplication.run(SimpleApi::class.java, *args)
}
