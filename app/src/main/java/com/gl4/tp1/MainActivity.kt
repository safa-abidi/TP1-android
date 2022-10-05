package com.gl4.tp1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txtEmail : EditText
    lateinit var txtPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtEmail = findViewById(R.id.editTextTextEmailAddress)
        txtPassword = findViewById(R.id.editTextTextPassword)

    }
    var email = txtEmail.text.toString()
    var password = txtPassword.text.toString()

    fun login(view: View?) {
        if(email == "gl4@insat.tn" && password =="insat2022"){
            Toast.makeText(this,"login successful",Toast.LENGTH_SHORT).show()
            val intent = Intent(view?.context,WelcomeActivity::class.java)
            intent.putExtra("email",email)
            startActivity(intent)

        }else{
            Toast.makeText(this,"wrong credentials",Toast.LENGTH_SHORT).show()
        }
    }
}