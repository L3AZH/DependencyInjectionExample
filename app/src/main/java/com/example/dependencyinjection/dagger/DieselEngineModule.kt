package com.example.dependencyinjection.dagger

import com.example.dependencyinjection.car.DieselEngine
import com.example.dependencyinjection.car.Engine
import dagger.Module
import dagger.Provides


@Module
class DieselEngineModule {

    @Provides
    fun providerEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine;
    }
}