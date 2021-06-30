package com.example.dependencyinjection.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private  val TAG = "REMOTE TAG"

    fun setListener(car: Car){
        Log.i(TAG, "setListener: enable remote for car")
    }
}