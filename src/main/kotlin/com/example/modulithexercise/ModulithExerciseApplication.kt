package com.example.modulithexercise

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
@ConfigurationPropertiesScan
class ModulithExerciseApplication

fun main(args: Array<String>) {
    runApplication<ModulithExerciseApplication>(*args)
}

inline fun <reified T> T.logger(): Logger {
    if (T::class.isCompanion){
        return LoggerFactory.getLogger(T::class.java.enclosingClass)
    }
    return LoggerFactory.getLogger(T::class.java)
}