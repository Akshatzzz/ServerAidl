package com.example.aidlserverattempt2

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService() : Service() {


    lateinit var mainActivity: MainActivity
    override fun onBind(intent: Intent): IBinder {
        mainActivity = MainActivity()
        return binder
    }


    private val binder: IMyAidlInterface.Stub = object : IMyAidlInterface.Stub() {
        override fun getColor(): String {
            val str = mainActivity.string
            Log.d("SERVER", "$str")
            return str
        }

    }
}