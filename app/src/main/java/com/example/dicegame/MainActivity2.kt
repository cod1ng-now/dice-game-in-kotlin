package com.example.dicegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.concurrent.timer

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn: Button = findViewById(R.id.button)
        val imageView2: ImageView = findViewById(R.id.imageView2)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        imageView2.setOnClickListener {
            val i = Intent(this, Name::class.java)
            startActivity(i)
        }

    }
}