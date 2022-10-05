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

        txtEmail = findViewById(R.id.editTextEmailAddress)
        txtPassword = findViewById(R.id.editTextPassword)
    }

    fun login(view: View){
        var email = txtEmail.text.toString()
        var password = txtPassword.text.toString()

        if(email == "gl4@insat.tn" && password =="insat2022"){
            Toast.makeText(this,"successful login",Toast.LENGTH_SHORT).show()
            val intent = Intent(view.context,WelcomeActivity::class.java)
            intent.putExtra("email",email)
            startActivity(intent)
        }else{
            Toast.makeText(this,"bad credentials",Toast.LENGTH_SHORT).show()
        }
    }

    fun openGalery(view: View) {
        val intent2 = Intent(this, GaleryActivity::class.java )
        startActivity(intent2)
    }

}