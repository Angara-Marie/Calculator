package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    lateinit var tvAnswer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        tvAnswer = findViewById(R.id.tvAnswer)

        btnAdd = findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNumber.text.toString()

            addition(num1.toInt(),num2.toInt())
        }
        btnSubtract = findViewById(R.id.btnSubtract)
        btnSubtract.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNumber.text.toString()
            subtraction(num1.toInt(),num2.toInt())

        }
        btnMultiply =findViewById(R.id.btnMultiply)
        btnMultiply.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNumber.text.toString()
            multiplication(num1.toInt(),num2.toInt())
        }
        btnModulus = findViewById(R.id.btnModulus)
        btnModulus.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNumber.text.toString()
            modulus(num1.toInt(),num2.toInt())
        }
    }
    fun addition(num1:Int,num2:Int){
        val result = num1 + num2
        tvAnswer.text = result.toString()
    }
    fun subtraction(num1: Int,num2: Int){
        val result = num1 - num2
        tvAnswer.text = result.toString()
    }
    fun multiplication(num1: Int,num2: Int){
        val result = num1 * num2
        tvAnswer.text = result.toString()
    }
    fun modulus(num1: Int,num2: Int){
        val result = num1 % num2
        tvAnswer.text = result.toString()
    }
}