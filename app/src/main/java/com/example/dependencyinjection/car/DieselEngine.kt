package com.example.dependencyinjection.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {
    
    companion object{
        private const val TAG = "DieselEngine TAG"
    }
    
    override fun start() {
        Log.i(TAG, "start: DieselEngine start....")
    }
}