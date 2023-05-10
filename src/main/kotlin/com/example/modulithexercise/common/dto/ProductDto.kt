package com.example.modulithexercise.common.dto

import java.math.BigDecimal

data class ProductDto(
    val name: String,
    val description: String,
    val price: BigDecimal,
    val count: Int
)