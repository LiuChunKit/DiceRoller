package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.randomNumber_button)
        countButton.setOnClickListener { randomNumber() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val randomInt = Random().nextInt(6) + 1
        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()
    }

    private fun randomNumber() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        if (resultText.text == "Hello World!" || resultText2.text == "Hello World!" || resultText3.text == "Hello World!") {
            resultText.text = "1"
            resultText2.text = "1"
            resultText3.text = "1"
        } else {

            var resultInt = resultText.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()
            var resultInt3 = resultText3.text.toString().toInt()

            if (resultInt < 6 || resultInt2 < 6 || resultInt3 < 6) {
                resultInt++
                resultInt2++
                resultInt3++

                resultText.text = resultInt.toString()
                resultText2.text = resultInt2.toString()
                resultText3.text = resultInt3.toString()

            }
        }

    }


