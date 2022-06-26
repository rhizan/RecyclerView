package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // ALGORITMANYA KETIKA 3000 DETIK DELAT DI LEMPAR KE MAIN ACTIVITY
        Handler(Looper.getMainLooper()).postDelayed({
          startActivity(Intent(this, MainActivity::class.java))
            finish()
        },3000)
    }
}