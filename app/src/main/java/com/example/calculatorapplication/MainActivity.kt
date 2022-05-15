package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumbOne: EditText
    lateinit var etNumbTwo: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumbOne = findViewById(R.id.etNumbOne)
        etNumbTwo = findViewById(R.id.etNumbTwo)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            tvResult.text = ""
            val numbOne = etNumbOne.text.toString()
            val numbTwo = etNumbTwo.text.toString()

            if (numbOne.isBlank() || numbTwo.isBlank()){
                etNumbOne.error = "Number is required"
                return@setOnClickListener
            }
            addition(etNumbOne.toString().toDouble(), etNumbTwo.toString().toDouble())
        }
        btnSubtract.setOnClickListener {
            tvResult.text = ""
            val numbOne = etNumbOne.text.toString()
            val numbTwo = etNumbTwo.text.toString()

            if (numbOne.isBlank() || numbTwo.isBlank()){
                etNumbOne.error = "Number is required"
                return@setOnClickListener
            }
            subtraction(etNumbOne.toString().toDouble(), etNumbTwo.toString().toDouble())
        }
        btnMultiply.setOnClickListener {
            tvResult.text = ""
            val numbOne = etNumbOne.text.toString()
            val numbTwo = etNumbTwo.text.toString()

            if (numbOne.isBlank() || numbTwo.isBlank()){
                etNumbOne.error = "Number is required"
                return@setOnClickListener
            }
            multiplication(etNumbOne.toString().toDouble(), etNumbTwo.toString().toDouble())
        }
        btnModulus.setOnClickListener {
            tvResult.text = ""
            val numbOne = etNumbOne.text.toString()
            val numbTwo = etNumbTwo.text.toString()

            if (numbOne.isBlank() || numbTwo.isBlank()){
                etNumbOne.error = "Number is required"
                return@setOnClickListener
            }
            modulus(etNumbOne.toString().toDouble(), etNumbTwo.toString().toDouble())
        }
    }
    fun addition(etNumbOne: Double, etNumbTwo:Double){
        val add = etNumbOne + etNumbTwo
        tvResult.text = add.toString()
    }
    fun subtraction(etNumbOne: Double, etNumbTwo:Double){
        val subtract = etNumbOne - etNumbTwo
        tvResult.text = subtract.toString()
    }
    fun multiplication(etNumbOne: Double, etNumbTwo:Double){
        val multiply = etNumbOne * etNumbTwo
        tvResult.text = multiply.toString()
    }
    fun modulus(etNumbOne: Double, etNumbTwo:Double){
        val modulus = etNumbOne % etNumbTwo
        tvResult.text = modulus.toString()
    }
}