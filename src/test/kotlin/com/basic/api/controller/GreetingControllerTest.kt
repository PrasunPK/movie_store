package com.basic.api.controller

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingControllerTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun testGreetingShouldReturnAnIdAndHelloTestAsContentWhenNoNameIsPassed() {
        val result = testRestTemplate.getForEntity("/greeting?name=Test", String::class.java)
        assertNotNull(result)
        assertEquals(result.body, "{\"id\":1,\"content\":\"Hello Test\"}")
    }

    @Test
    fun testGreetingShouldReturnAnIdAndHelloWorldAsContentWhenNoNameIsNotPassed() {
        val result = testRestTemplate.getForEntity("/greeting", String::class.java)
        assertNotNull(result)
        assertEquals(result.body, "{\"id\":2,\"content\":\"Hello world\"}")
    }

}