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
        val fiveDollar = Dollar(5)
        var newDollar: Dollar = fiveDollar.times(2)
        assertEquals(Dollar(10), newDollar)
        newDollar = fiveDollar.times(3)
        assertEquals(Dollar(15), newDollar)
    }

    @Test
    fun testEqualityDollar() {
        assertEquals(Dollar(7), Dollar(7))
        assertNotEquals(Dollar(10), Dollar(20))
    }

    @Test
    fun testMultiplicationFranc() {
        val fiveFranc = Franc(5)
        var newFranc: Franc = fiveFranc.times(2)
        assertEquals(Franc(10), newFranc)
        newFranc = fiveFranc.times(3)
        assertEquals(Franc(15), newFranc)
    }

    @Test
    fun testEqualityFranc() {
        assertEquals(Franc(7), Franc(7))
        assertNotEquals(Franc(10), Franc(20))
    }

    @Test
    fun `5 Dollar is not equals to 5 franc`() {
        assertNotEquals(Franc(5), Dollar(5))
    }
}
