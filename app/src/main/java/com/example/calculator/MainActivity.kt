package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var numberone: EditText
    lateinit var numbertwo: EditText
    lateinit var addbutton: Button
    lateinit var minusbutton: Button
    lateinit var multibutton: Button

    lateinit var answertv: TextView
    var numone: Int? = null
    var numtwo: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberone = findViewById(R.id.num1)
        numbertwo = findViewById(R.id.num2)
        addbutton = findViewById(R.id.addbutton)
        minusbutton = findViewById(R.id.minusbutton)
        multibutton = findViewById(R.id.multibutton)
        answertv = findViewById(R.id.anstv)

        minusbutton.setOnClickListener {
            if (numberone.text.isNullOrBlank() || numbertwo.text.isNullOrBlank()) {
                answertv.text = "Please Give a Int input"
            } else {
                numone = numberone.text.toString().toInt()
                numtwo = numbertwo.text.toString().toInt()
                answertv.text = (numone!! - numtwo!!).toString()
            }

        }
        addbutton.setOnClickListener {
            if (numberone.text.isNullOrBlank() || numbertwo.text.isNullOrBlank()) {
                answertv.text = "Please Give a Int input"
            } else {
                numone = numberone.text.toString().toInt()
                numtwo = numbertwo.text.toString().toInt()
                answertv.text = (numone!! + numtwo!!).toString()
            }

        }

        multibutton.setOnClickListener {
            if (numberone.text.isNullOrBlank() || numbertwo.text.isNullOrBlank()) {
                answertv.text = "Please Give a Int input"
            } else {
                numone = numberone.text.toString().toInt()
                numtwo = numbertwo.text.toString().toInt()
                answertv.text = (numone!! * numtwo!!).toString()
            }

        }
    }
}