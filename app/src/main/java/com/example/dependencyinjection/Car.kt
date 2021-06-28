package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Car() {

    private val TAG = "CAR TAG"

    lateinit var engine:Engine
    lateinit var wheels: Wheels

    @Inject
    constructor(engine: Engine,wheels: Wheels):this(){
        this.engine = engine
        this.wheels = wheels
    }

    fun drive(){
        Log.i(TAG, "drive: driving .....")
    }
}