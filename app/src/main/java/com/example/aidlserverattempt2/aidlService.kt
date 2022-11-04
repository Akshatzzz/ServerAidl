package com.example.aidlserverattempt2

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class aidlService() : Service() {


    lateinit var mainActivity: MainActivity
    override fun onBind(intent: Intent): IBinder {
        mainActivity = MainActivity()
        return binder
    }


    private val binder: IAidlInterface.Stub = object : IAidlInterface.Stub() {
        override fun sendStr(): String {
            val str = mainActivity.string
            Log.d("SERVER", "$str")
            return str
        }

    }
}