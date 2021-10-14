package com.kukot

open class Money(protected var amount: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Money && other.amount == amount
    }
}
