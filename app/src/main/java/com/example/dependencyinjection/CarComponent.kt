package com.example.dependencyinjection

import dagger.Component

@Component
interface CarComponent {

    fun getCar():Car

    fun injectForMainActivity(mainActivity: MainActivity)
}