package com.example.dependencyinjection

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

    // injection field(2)
    @Inject lateinit var engine:Engine
    lateinit var wheels: Wheels


    //injection contructor (1)
    @Inject
    constructor(wheels: Wheels):this(){
        this.wheels = wheels
    }


    //injection method(3)
    @Inject
    fun enableRemote(remote:Remote){
        remote.setListener(this)
    }

    fun drive(){
        Log.i(TAG, "drive: driving .....")
    }
}