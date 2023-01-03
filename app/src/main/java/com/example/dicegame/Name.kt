package com.example.dicegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btn : Button = findViewById(R.id.button2)

        btn.setOnClickListener {
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }

    }
}