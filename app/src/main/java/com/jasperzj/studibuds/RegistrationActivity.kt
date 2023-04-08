package com.jasperzj.studibuds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegistrationActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var emailText = findViewById<EditText>(R.id.emailText)
        var passwordText = findViewById<EditText>(R.id.passwordText)
        var btnSubmit = findViewById<Button>(R.id.btnSubmit)

        auth = FirebaseAuth.getInstance()
        btnSubmit.setOnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {

                    }
                }
        }
    }
}