package com.jasperzj.studibuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()
        var emailTextView = findViewById<EditText>(R.id.loginEmailText)
        var passwordTextView = findViewById<EditText>(R.id.loginPasswordText)
        var loginButton = findViewById<Button>(R.id.loginBtnSubmit)

        loginButton.setOnClickListener {
            val email = emailTextView.text.toString()
            val password = passwordTextView.text.toString()
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.i(".LoginActivity", "signin email success")
                    val intent = Intent(this, FullActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Log.w(".LoginActivity", "signin email failure", task.exception)
                    Toast.makeText(this, "Authentication failure.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}