package com.example.dependencyinjection.car

import android.util.Log
import javax.inject.Inject
import kotlin.properties.Delegates

class DieselEngine(): Engine {

    private var horsePower:Int? = null

    @Inject constructor(horsePower:Int):this(){
        this.horsePower = horsePower
    }

    companion object{
        private const val TAG = "DieselEngine TAG"
    }

    
    override fun start() {
        Log.i(TAG, "start: DieselEngine start.... \n HorsePower: $horsePower")
    }
}