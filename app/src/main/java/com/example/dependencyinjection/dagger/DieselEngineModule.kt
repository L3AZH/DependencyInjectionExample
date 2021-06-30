package com.example.dependencyinjection.dagger

import com.example.dependencyinjection.car.DieselEngine
import com.example.dependencyinjection.car.Engine
import dagger.Module
import dagger.Provides


@Module
class DieselEngineModule() {

    private var horsePower:Int? = null

    constructor(horsePower:Int):this(){
        this.horsePower = horsePower
    }

    @Provides
    fun providerEngine(): Engine {
        return DieselEngine(horsePower!!);
    }
}