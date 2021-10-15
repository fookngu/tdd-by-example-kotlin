package com.kukot

abstract class Money(protected var amount: Int) {
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
