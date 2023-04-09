package com.jasperzj.studibuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = Firebase.auth
        auth.signOut() // Debug
        val currentUser = auth.currentUser
        Handler(Looper.getMainLooper()).postDelayed({
            if (currentUser != null) {
                val intent = Intent(this, FullActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                val intent = Intent(this, LoginOrRegisterActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 1750)
    }


}