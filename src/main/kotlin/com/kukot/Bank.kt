package com.kukot

class Bank {
    fun reduce(expression: Expression, toCurrency: Currency): Money {
        return expression.reduce(toCurrency)
    }
}
