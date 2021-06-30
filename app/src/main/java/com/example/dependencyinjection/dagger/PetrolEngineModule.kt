package com.example.dependencyinjection.dagger

import com.example.dependencyinjection.car.Engine
import com.example.dependencyinjection.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun providerEngine(petrolEngine: PetrolEngine): Engine
}