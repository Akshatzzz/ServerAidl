package com.example.aidlserverattempt2

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService() : Service() {



    override fun onBind(intent: Intent): IBinder {
        return binder
    }

    private val binder: IMyAidlInterface.Stub = object : IMyAidlInterface.Stub() {
        override fun getColor(): String {
            return "hello"
        }

    }
}