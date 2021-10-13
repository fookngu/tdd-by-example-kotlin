package com.kukot

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MoneyTest {

    // TODO:
    // $5 + 10 CHF = $10 (with rate of 2:1)
    // $5 * 2 = $10
    // make amount private
    // dollar side effects
    // money rounding
    @Test
    fun testMultiplication() {
        val fiveDollar = Dollar(5)
        var newDollar: Dollar = fiveDollar.times(2)
        assertEquals(10, newDollar.amount)
        newDollar = fiveDollar.times(3)
        assertEquals(15, newDollar.amount)
    }
}
