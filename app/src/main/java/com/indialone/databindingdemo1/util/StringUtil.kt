package com.indialone.databindingdemo1.util

object StringUtil {
    fun getQuantityString(quantity: Int): String {
        return "Qty: $quantity"
    }

    fun convertIntToString(value: Int): String {
        return "($value)"
    }
}