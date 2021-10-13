package com.kukot

class Dollar(private var amount: Int) {

    fun times(multiplier: Int): Dollar {
        val newAmount = multiplier * amount
        return Dollar(newAmount)
    }

    override fun equals(other: Any?): Boolean {
        return other is Dollar && other.amount == amount
    }
}
