package com.kukot

open class Money(protected val amount: Int, val currency: Currency) {
    override fun equals(other: Any?): Boolean {
        return other is Money && other.amount == amount && other.currency == currency
    }

    companion object {
        fun dollarOf(amount: Int): Money {
            return Money(amount, Currency.DOLLAR)
        }

        fun francOf(amount: Int): Money {
            return Money(amount, Currency.FRANC)
        }
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    override fun toString(): String {
        return "$amount ${currency.name.capitalize()}"
    }
}

enum class Currency {
    DOLLAR, FRANC
}
