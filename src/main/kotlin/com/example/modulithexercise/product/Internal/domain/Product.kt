package com.example.modulithexercise.product.Internal.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
class Product(
    id: Long,
    description: String,
    price: BigDecimal,
    count: Int
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = id

    var description: String = description
    var price: BigDecimal = price
    var count: Int = count
}