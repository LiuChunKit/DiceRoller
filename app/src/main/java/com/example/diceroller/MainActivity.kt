package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countUp_button)
        countButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{resetBtn()}


    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        val randomInt2 = Random.nextInt(6) + 1
        val randomInt3 = Random.nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.resultText)
        val resultText2: TextView = findViewById(R.id.resultText2)
        val resultText3: TextView = findViewById(R.id.resultText3)

        resultText.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()
    }

    private fun countUp() {

        val resultText: TextView = findViewById(R.id.resultText)
        val resultText2: TextView = findViewById(R.id.resultText2)
        val resultText3: TextView = findViewById(R.id.resultText3)

        val resultArr = arrayOf(resultText, resultText2, resultText3)

        for(chkResultArr in resultArr){
            if(chkResultArr.text.toString().toIntOrNull() == null){
                chkResultArr.text = "1"
            }
            else{
                val onScreenResult = chkResultArr.text.toString().toInt()
                if(onScreenResult < 6){
                    chkResultArr.text = (onScreenResult + 1).toString()
                }
                else{
                    chkResultArr.text = onScreenResult.toString()
                }
            }
        }
    }

    private fun resetBtn(){

        val resultText: TextView = findViewById(R.id.resultText)
        val resultText2: TextView = findViewById(R.id.resultText2)
        val resultText3: TextView = findViewById(R.id.resultText3)

        resultText.text = "0"
        resultText2.text = "0"
        resultText3.text = "0"

    }
}


