package com.jasperzj.studibuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.jasperzj.studibuds.card.AppData

class RegistrationActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var emailText = findViewById<EditText>(R.id.emailText)
        var passwordText = findViewById<EditText>(R.id.passwordText)
        var btnSubmit = findViewById<Button>(R.id.btnSubmit)
        var discordTag = findViewById<EditText>(R.id.discordTagText)
        var nickname = findViewById<EditText>(R.id.nicknameText)

        auth = FirebaseAuth.getInstance()
        btnSubmit.setOnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Log.i(".RegistrationActivity", "create email success")
                        val intent = Intent(this, PersonalityActivity::class.java)
                        startActivity(intent)
                        AppData.discordTag = discordTag.text.toString()
                        AppData.nickname = nickname.text.toString()
                        finish()
                    } else {
                        Log.w(".RegistrationActivity", "create email failure", task.exception)
                        Toast.makeText(this, "Authentication failure.", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}