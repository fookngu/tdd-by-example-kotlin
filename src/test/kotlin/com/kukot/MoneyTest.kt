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
    fun testMultiplicationMoney() {
        val fiveDollar = Money.dollarOf(5)
        val fiveFranc = Money.francOf(5)
        assertEquals(Money.dollarOf(10), fiveDollar.times(2))
        assertEquals(Money.francOf(20), fiveFranc.times(4))
    }

    @Test
    fun testEqualityMoney() {
        assertEquals(Money.dollarOf(7), Money.dollarOf(7))
        assertEquals(Money.francOf(25), Money.francOf(25))
        assertNotEquals(Money.dollarOf(10), Money.dollarOf(20))
        assertNotEquals(Money.francOf(5), Money.dollarOf(5))
    }

    @Test
    fun testCurrencies() {
        assertEquals(Currency.DOLLAR, Money.dollarOf(5).currency)
        assertEquals(Currency.FRANC, Money.francOf(10).currency)
    }

    @Test
    fun testMoneyToString() {
        assertEquals("5 DOLLAR", Money.dollarOf(5).toString())
        assertEquals("10 FRANC", Money.francOf(10).toString())
    }
}
