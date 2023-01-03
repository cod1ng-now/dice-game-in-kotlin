package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn1: Button = findViewById(R.id.btn2)
        val img1: ImageView = findViewById(R.id.imageView3)

        val btn2: Button = findViewById(R.id.btn)
        val img2: ImageView = findViewById(R.id.imageView)

        val tw: TextView = findViewById(R.id.tw)

        tw.setText(R.id.nm1!!)

        val tw2: TextView = findViewById(R.id.tw2)

        tw2.setText(R.id.nm2!!)

        btn1.setOnClickListener {
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
            img1.setImageResource(ImageDice)
            Toast.makeText(this, "Dice", Toast.LENGTH_SHORT).show()
        }





        btn2.setOnClickListener {
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
            img2.setImageResource(ImageDice)
            Toast.makeText(this, "Dice", Toast.LENGTH_SHORT).show()
        }



    }
}