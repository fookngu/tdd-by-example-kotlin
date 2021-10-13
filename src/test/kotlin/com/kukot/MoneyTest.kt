package com.kukot

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MoneyTest {

    @Test
    fun testMultiplication() {
        val fiveDollar = Dollar(5)
        fiveDollar.times(2)
        assertEquals(10, fiveDollar.amount)
    }
}
