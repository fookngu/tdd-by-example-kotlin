package com.kukot

class Dollar(amount: Int) : Money(amount) {

    fun times(multiplier: Int): Dollar {
        val newAmount = multiplier * amount
        return Dollar(newAmount)
    }
}
