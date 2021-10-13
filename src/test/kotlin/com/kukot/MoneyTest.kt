package com.kukot

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class MoneyTest {

    // TODO:
    // $5 + 10 CHF = $10 (with rate of 2:1)
    // $5 * 2 = $10 - DONE
    // make amount private - DONE
    // dollar side effects - DONE
    // money rounding
    @Test
    fun testMultiplication() {
        val fiveDollar = Dollar(5)
        var newDollar: Dollar = fiveDollar.times(2)
        assertEquals(Dollar(10), newDollar)
        newDollar = fiveDollar.times(3)
        assertEquals(Dollar(15), newDollar)
    }

    @Test
    fun testEquality() {
        assertEquals(Dollar(7), Dollar(7))
        assertNotEquals(Dollar(10), Dollar(20))
    }
}
