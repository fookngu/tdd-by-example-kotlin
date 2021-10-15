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
    // Common equals - DONE
    // common times
    @Test
    fun testMultiplicationDollar() {
        val fiveDollar = Money.dollarOf(5)
        assertEquals(Money.dollarOf(10), fiveDollar.times(2))
        assertEquals(Money.dollarOf(15), fiveDollar.times(3))
    }

    @Test
    fun testEqualityDollar() {
        assertEquals(Money.dollarOf(7), Money.dollarOf(7))
        assertNotEquals(Money.dollarOf(10), Money.dollarOf(20))
    }

    @Test
    fun testMultiplicationFranc() {
        val fiveFranc = Money.francOf(5)
        assertEquals(Money.francOf(20), fiveFranc.times(4))
        assertEquals(Money.francOf(25), fiveFranc.times(5))
    }

    @Test
    fun testEqualityFranc() {
        assertEquals(Money.francOf(7), Money.francOf(7))
        assertNotEquals(Money.francOf(10), Money.francOf(20))
    }

    @Test
    fun `5 Dollar is not equals to 5 franc`() {
        assertNotEquals(Money.francOf(5), Money.dollarOf(5))
    }
}
