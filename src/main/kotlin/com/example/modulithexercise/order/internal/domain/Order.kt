package com.example.modulithexercise.order.internal.domain

import com.example.modulithexercise.common.dto.OrderIdentifier
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Order(
        id: OrderIdentifier,
        productId: Long
) {
    @Column
    @Id
    val id: OrderIdentifier = id


    var productId: Long = productId
}