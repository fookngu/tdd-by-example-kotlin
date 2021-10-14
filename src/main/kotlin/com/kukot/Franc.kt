package com.kukot

class Franc(private var amount: Int) {

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
    override fun equals(other: Any?): Boolean {
        return other is Franc && other.amount == amount
    }
}