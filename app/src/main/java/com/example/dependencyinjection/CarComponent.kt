package com.example.dependencyinjection

import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponent {

    fun getCar():Car

    fun injectForMainActivity(mainActivity: MainActivity)
}