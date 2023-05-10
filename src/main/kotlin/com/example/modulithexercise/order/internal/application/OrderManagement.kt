package com.example.modulithexercise.order.internal.application

import com.example.modulithexercise.logger
import com.example.modulithexercise.common.event.OrderCompleted
import com.example.modulithexercise.common.dto.OrderDto
import jakarta.transaction.Transactional
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class OrderManagement(
    val events: ApplicationEventPublisher,
) {

    fun create(): OrderDto {
        return OrderDto()
    }

    @Transactional
    fun complete(orderDto: OrderDto){
        logger().info("******* order management complete start ********")
        events.publishEvent(OrderCompleted(orderDto.id))
        logger().info("******* order management complete end ********")
    }
}