package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btn)
        val img: ImageView = findViewById(R.id.imageView3)

        btn.setOnClickListener {
            var randomNo = (1..6).random()
            var ImageDice: Int
            if(randomNo == 1){
                ImageDice = R.drawable.dice_1
            }
            else if(randomNo == 2){
                ImageDice = R.drawable.dice_2
            }
            else if(randomNo == 3){
                ImageDice = R.drawable.dice_3
            }
            else if(randomNo == 4){
                ImageDice = R.drawable.dice_4
            }
            else if(randomNo == 5){
                ImageDice = R.drawable.dice_5
            }
            else{
                ImageDice = R.drawable.dice_6
            }
            img.setImageResource(ImageDice)
            Toast.makeText(this, "Dice", Toast.LENGTH_SHORT).show()
        }
    }
}