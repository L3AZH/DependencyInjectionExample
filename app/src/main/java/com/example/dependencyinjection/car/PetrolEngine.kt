package com.example.dependencyinjection.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {


    companion object{
        private const val TAG = "PetrolEngine TAG"
    }

    override fun start() {
        Log.i(TAG, "start: PetrolEngine start")
    }
}