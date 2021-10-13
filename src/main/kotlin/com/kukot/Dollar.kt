package com.kukot

class Dollar(val amount: Int) {

    fun times(multiplier: Int): Dollar {
        val newAmount = multiplier * amount
        return Dollar(newAmount)
    }
}
