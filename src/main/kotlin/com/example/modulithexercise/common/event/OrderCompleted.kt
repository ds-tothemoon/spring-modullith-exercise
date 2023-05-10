package com.example.modulithexercise.common.event

import com.example.modulithexercise.common.DomainEvent
import com.example.modulithexercise.common.dto.OrderIdentifier

data class OrderCompleted(val orderId: OrderIdentifier): DomainEvent