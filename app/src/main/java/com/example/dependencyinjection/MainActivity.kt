package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjection.car.Car
import com.example.dependencyinjection.dagger.DaggerCarComponent
import com.example.dependencyinjection.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.builder().apply {
            dieselEngineModule(DieselEngineModule(150))
        }.build()
        component.injectForMainActivity(this)
        car.drive()
    }
}