package com.example.lab88

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var serviceIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        serviceIntent = Intent(this, MyService::class.java)
    }

    fun startService(view: View) {
        ContextCompat.startForegroundService(this, serviceIntent)
    }

    fun stopService(view: View) {
        stopService(serviceIntent)
    }

    fun nextActivity(view: View) {
        startActivity(Intent(this, MainActivity2::class.java))
    }
}
