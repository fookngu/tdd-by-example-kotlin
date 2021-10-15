package com.kukot

class Dollar(amount: Int) : Money(amount, currency = Currency.DOLLAR) {

    override fun times(multiplier: Int): Money {
        return dollarOf(amount * multiplier)
    }
}
