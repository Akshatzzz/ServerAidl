package com.example.aidlserverattempt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object {
        var str = "Hello From Server"
    }

    var string: String = str
    lateinit var btn: Button
    lateinit var etText: EditText
    lateinit var myService: MyService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()



        btn.setOnClickListener {
            if (etText.text.isNotEmpty()) {
                str = etText.text.toString()
                string = str

            }
        }
    }


    private fun initialize() {
//        str = "Hello From Server"
        btn = findViewById(R.id.SEND)
        etText = findViewById(R.id.etEnter)

    }
}