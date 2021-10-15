package com.kukot

interface Expression {
    fun reduce(toCurrency: Currency): Money
}
