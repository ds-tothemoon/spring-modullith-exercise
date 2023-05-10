package com.example.modulithexercise.order

import com.example.modulithexercise.logger
import com.example.modulithexercise.order.internal.Order
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