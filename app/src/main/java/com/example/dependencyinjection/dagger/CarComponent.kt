package com.example.dependencyinjection.dagger

import com.example.dependencyinjection.MainActivity
import com.example.dependencyinjection.car.Car
import dagger.Component

@Component (modules = [DieselEngineModule::class, WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    fun injectForMainActivity(mainActivity: MainActivity)
}