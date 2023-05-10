package com.example.modulithexercise.order.internal

import com.example.modulithexercise.order.OrderIdentifier
import com.example.modulithexercise.product.Internal.domain.Product
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Order(
    id: OrderIdentifier,
    products: Set<Product>
) {
    @Id
    val id: OrderIdentifier = id

    @OneToMany
    var products: Set<Product> = products
}