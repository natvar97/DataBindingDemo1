package com.indialone.databindingdemo1.util

import java.math.BigDecimal
import java.text.DecimalFormat

object BigDecimalUtil {

    fun getValue(value: BigDecimal?): String {
        val df = DecimalFormat("###,###,###.00")
        return df.format(value).toString()
    }

    fun getFloat(value: BigDecimal): Float {
        return value.toFloat()
    }
}