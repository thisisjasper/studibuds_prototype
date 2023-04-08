package com.jasperzj.studibuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class LoginOrRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_or_register)

        var btnRegister = findViewById<Button>(R.id.btnRegister)
        var btnLogin = findViewById<Button>(R.id.btnLogin)
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            this.startActivity(intent)
        }
        btnLogin.setOnClickListener {
//            TODO
//            val intent = Intent(this, Login::class.java)
//            this.startActivity(intent)
        }
    }
}