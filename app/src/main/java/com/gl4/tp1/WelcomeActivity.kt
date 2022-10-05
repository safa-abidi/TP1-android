package com.gl4.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    lateinit var t : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        t = findViewById(R.id.welcomeMsg)

        val email = intent.getStringExtra("email")
        t.text = "Welcome $email"
    }
}