package com.kukot

class Franc(amount: Int) : Money(amount, currency = Currency.FRANC) {

    override fun times(multiplier: Int): Money {
        return francOf(amount * multiplier)
    }
}
