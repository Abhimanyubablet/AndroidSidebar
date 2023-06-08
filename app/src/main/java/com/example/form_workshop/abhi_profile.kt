package com.example.form_workshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class abhi_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abhi_profile)

     Handler().postDelayed({
        startActivity(Intent(this,protfolio::class.java))
     },2000)
    }
}