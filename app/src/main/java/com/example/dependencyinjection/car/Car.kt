package com.example.dependencyinjection.car

import android.util.Log
import javax.inject.Inject

class Car() {

    /**
     * Thu tu chay la 1 - 2 - 3
     * injection field va method se tu dong chay neu nhu
     * injection contructor chay, neu khong co injection
     * contructor thi phai chay component.inject(this)
     * giong nhu trong activity main
     */

    private val TAG = "CAR TAG"

    // truong hop engine la 1 interface
    lateinit var engine: Engine
    //truong hop chung ta khong the injection Wheels class -> xem o wheels class
    lateinit var wheels: Wheels


    //injection contructor (1)
    @Inject
    constructor(engine: Engine, wheels: Wheels):this(){
        this.wheels = wheels
        this.engine = engine
    }


    //injection method(3)
    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        engine.start();
        Log.i(TAG, "drive: driving .....")
    }
}