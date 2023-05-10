package com.example.modulithexercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter

class ModulithExerciseApplicationKtTest{

    @Test
    fun writeDocs(){
        val modules = ApplicationModules.of(ModulithExerciseApplication::class.java).verify()
        Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml()
    }
}