package com.gl4.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    lateinit var welcomeMsg : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        welcomeMsg = findViewById(R.id.txtWelcome)
        val email = intent.getStringExtra("email")
        welcomeMsg.text = "Bienvenue $email"
    }

}