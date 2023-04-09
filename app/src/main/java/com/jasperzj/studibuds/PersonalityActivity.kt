package com.jasperzj.studibuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.jasperzj.studibuds.card.AppData

class PersonalityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personality)

        val nextButton = findViewById<Button>(R.id.nextButton)
        val descriptionText = findViewById<EditText>(R.id.descriptionText)
        val interestsText = findViewById<EditText>(R.id.interestsText)
        nextButton.setOnClickListener {
            AppData.description = descriptionText.text.toString()
            val intent = Intent(this, FullActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}