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
        val fiveDollar = Money.ofDollar(5)
        val fiveFranc = Money.ofFranc(5)
        assertEquals(Money.ofDollar(10), fiveDollar.times(2))
        assertEquals(Money.ofFranc(20), fiveFranc.times(4))
    }

    @Test
    fun testEqualityMoney() {
        assertEquals(Money.ofDollar(7), Money.ofDollar(7))
        assertEquals(Money.ofFranc(25), Money.ofFranc(25))
        assertNotEquals(Money.ofDollar(10), Money.ofDollar(20))
        assertNotEquals(Money.ofFranc(5), Money.ofDollar(5))
    }

    @Test
    fun testCurrencies() {
        assertEquals(Currency.DOLLAR, Money.ofDollar(5).currency)
        assertEquals(Currency.FRANC, Money.ofFranc(10).currency)
    }

    @Test
    fun testMoneyToString() {
        assertEquals("5 DOLLAR", Money.ofDollar(5).toString())
        assertEquals("10 FRANC", Money.ofFranc(10).toString())
    }

    @Test
    fun testSimpleAddition() {
        val fiveDollar = Money.ofDollar(5)
        val plusExpression: Expression = fiveDollar.plus(fiveDollar)
        val bank = Bank()
        val reduced: Money = bank.reduce(plusExpression, Currency.DOLLAR)
        assertEquals(Money.ofDollar(10), reduced)
    }

    @Test
    fun testPlusReturnSum() {
        val fiveDollar = Money.ofDollar(5)
        val fivePlusSixExpression = fiveDollar.plus(fiveDollar)
        val sum: Sum = fivePlusSixExpression as Sum
        assertEquals(fiveDollar, sum.augmend)
        assertEquals(fiveDollar, sum.addmend)
        assertEquals(fiveDollar, Money.ofDollar(2).plus(Money.ofDollar(3)))
    }

    @Test
    fun testReduceSum() {
        val sum: Expression = Sum(Money.ofDollar(3), Money.ofDollar(4))
        val bank = Bank()
        val result: Money = bank.reduce(sum, Currency.DOLLAR)
        assertEquals(Money.ofDollar(7), result)
    }

    @Test
    fun testReduceMoney() {
        val bank = Bank()
        val fiveFranc = Money.ofFranc(5)
        val reducedMoney = bank.reduce(fiveFranc, Currency.FRANC)
        assertEquals(reducedMoney, fiveFranc)
    }
}
