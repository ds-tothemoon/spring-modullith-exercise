package com.example.modulithexercise.order.api

import com.example.modulithexercise.order.OrderManagement
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("order")
class OrderController(
    private val orderManagement: OrderManagement
) {
    @GetMapping
    fun order(): ResponseEntity<String> {
        val order = orderManagement.create()
        orderManagement.complete(order)

        return ResponseEntity.ok("order completed")
    }
}