package com.masa.app.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var resultImgview:ImageView
    private lateinit var rollButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultImgview = findViewById(R.id.dice_imageview)

        rollButton = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener(this)

    }



    override fun onClick(v: View?) {
        val id = v!!.id  //Double-bang operator, exclamation-mark

        when(id){
            R.id.roll_button -> {
                rollDice()
                //Toast.makeText(this, "Button Clicked!", Toast.LENGTH_LONG).show();
            }
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1  // Random function generates num from 0~5
        val diceImg = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice_imageview.setImageResource(diceImg)
    }
}
