package com.example.modulithexercise.common.dto

import java.util.UUID

@JvmInline
value class OrderIdentifier(val id: UUID)
data class OrderDto(
    val id: OrderIdentifier = OrderIdentifier(UUID.randomUUID())
)