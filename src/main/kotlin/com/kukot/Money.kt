package com.kukot

open class Money(val amount: Int, val currency: Currency) : Expression {
    override fun equals(other: Any?): Boolean {
        return other is Money && other.amount == amount && other.currency == currency
    }

    companion object {
        fun ofDollar(amount: Int): Money {
            return Money(amount, Currency.DOLLAR)
        }

        fun ofFranc(amount: Int): Money {
            return Money(amount, Currency.FRANC)
        }
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    override fun toString(): String {
        return "$amount ${currency.name.capitalize()}"
    }

    fun plus(appended: Money): Expression {
        return Sum(Money(amount, currency), Money(appended.amount, currency))
    }

    override fun reduce(toCurrency: Currency): Money {
        return this
    }
}

enum class Currency {
    DOLLAR, FRANC
}
