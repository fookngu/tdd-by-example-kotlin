package com.kukot

abstract class Money(protected val amount: Int, val currency: Currency) {
    override fun equals(other: Any?): Boolean {
        return other is Money && other.javaClass == javaClass && other.amount == amount
    }

    companion object {
        fun dollarOf(amount: Int): Money {
            return Dollar(amount)
        }

        fun francOf(amount: Int): Money {
            return Franc(amount)
        }
    }

    abstract fun times(multiplier: Int): Money
}

enum class Currency {
    DOLLAR, FRANC
}
