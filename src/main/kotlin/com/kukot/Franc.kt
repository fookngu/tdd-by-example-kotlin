package com.kukot

class Franc(amount: Int) : Money(amount) {

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}
