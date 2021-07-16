package com.indialone.databindingdemo1.models

import android.os.Parcel
import java.math.BigDecimal

class Product {
    var title: String? = null
    var description: String? = null
    var image = 0
    var price: BigDecimal? = null
    var sale_price: BigDecimal? = null
    var num_ratings = 0
    var rating: BigDecimal? = null
    var serial_number = 0

    constructor(
        title: String?,
        description: String?,
        image: Int,
        price: BigDecimal?,
        sale_price: BigDecimal?,
        num_ratings: Int,
        rating: BigDecimal?,
        serial_number: Int
    ) {
        this.title = title
        this.description = description
        this.image = image
        this.price = price
        this.sale_price = sale_price
        this.num_ratings = num_ratings
        this.rating = rating
        this.serial_number = serial_number
    }

    constructor() {}
    protected constructor(`in`: Parcel) {
        title = `in`.readString()
        description = `in`.readString()
        image = `in`.readInt()
        num_ratings = `in`.readInt()
        serial_number = `in`.readInt()
    }

    fun hasSalePrice(): Boolean {
        val salePrice = sale_price!!.toDouble()
        return if (salePrice > 0) {
            true
        } else {
            false
        }
    }

    val numberRatingsString: String
        get() = "($num_ratings)"

    companion object {
        const val tAG = "Product"
    }
}