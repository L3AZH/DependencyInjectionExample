package com.example.dependencyinjection.car

import android.util.Log

class Tire {

    companion object{
         const val TAG = "TIRE TAG"
    }

    fun setUpForTire(){
        Log.i(TAG, "setUpForTire: Tire was setup")
    }
}