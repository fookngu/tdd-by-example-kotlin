package com.kukot

class Sum(val augmend: Money, val addmend: Money) : Expression {
    override fun reduce(toCurrency: Currency): Money {
        return Money(augmend.amount + addmend.amount, toCurrency)
    }
}
