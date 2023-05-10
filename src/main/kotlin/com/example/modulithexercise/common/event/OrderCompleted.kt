package com.example.modulithexercise.order.external.event

import com.example.modulithexercise.common.DomainEvent
import com.example.modulithexercise.order.external.dto.OrderIdentifier

data class OrderCompleted(val orderId: OrderIdentifier): DomainEvent