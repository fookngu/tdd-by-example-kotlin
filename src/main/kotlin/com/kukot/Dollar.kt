package com.kukot

class Dollar(amount: Int) : Money(amount) {

    override fun times(multiplier: Int): Money {
        val newAmount = multiplier * amount
        return Dollar(newAmount)
    }
}
