package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //telt de heoveelheid goede antwoorden
    private var goodAnswers: Int = 0
    private val wrongAnswer = 0
    private val allGood = 4



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitB.setOnClickListener {
            checkEersteLetter()
            checkTweedeLetter()
            checkDerdeLetter()
            checkVierdeLetter()
            aantalgoed()
        }

    }

    //this checks the answer that is put in the input box

    private fun checkEersteLetter() {
        val answer = answer1.text.toString()

        if (answer == getString(R.string.T1)) {
            goodAnswers++
        }
    }

    private fun checkTweedeLetter() {
        val answer = answer2.text.toString()

        if (answer == getString(R.string.F1)) {
            goodAnswers++
        }
    }

    private fun checkDerdeLetter() {
        val answer = answer3.text.toString()

        if (answer == getString(R.string.F1)) {
            goodAnswers++
        }
    }

    private fun checkVierdeLetter() {
        val answer = answer4.text.toString()

        if (answer == getString(R.string.F1)) {
            goodAnswers++
        }
    }

    private fun aantalgoed() {
        if (goodAnswers == allGood) {
            Toast.makeText(this, "je hebt alles goed ", Toast.LENGTH_SHORT).show()
            goodAnswers = wrongAnswer
        } else {
            Toast.makeText(this, "je hebt $goodAnswers goed", Toast.LENGTH_SHORT).show()
            goodAnswers = wrongAnswer
        }
    }


}
