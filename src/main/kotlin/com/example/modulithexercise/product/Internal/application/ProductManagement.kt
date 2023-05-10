package com.example.modulithexercise.product

import com.example.modulithexercise.logger
import com.example.modulithexercise.order.OrderCompleted
import org.springframework.context.ApplicationEventPublisher
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.transaction.event.TransactionalEventListener

@Service
class ProductManagement(val events: ApplicationEventPublisher) {

    @Async
    @TransactionalEventListener
    fun on(event: OrderCompleted){
        val orderId = event.orderId
        logger().info("***** product management processing start ******")
        Thread.sleep(1000)
        logger().info("***** product management processing end ******")
    }
}