package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var etNumber1=findViewById<EditText>(R.id.etNumber1)
        var etnumber2=findViewById<EditText>(R.id.etnumber2)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnsubtract=findViewById<Button>(R.id.btnsubtract)
        var btnmutltiply=findViewById<Button>(R.id.btnmultiply)
        var btnmodulus=findViewById<Button>(R.id.btnmodulus)
        var tvResult=findViewById<TextView>(R.id.tvresult)

        btnAdd.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etnumber2.text.toString().equals("")){
                Toast.makeText(baseContext,"Enter Number",Toast.LENGTH_LONG).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etnumber2.text.toString().toInt()
                var add = number1 + number2
              tvResult.text="Result$add"
            }
        }
        btnsubtract.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etnumber2.text.toString().equals("")){
                Toast.makeText(baseContext,"Enter Number",Toast.LENGTH_LONG).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etnumber2.text.toString().toInt()
                var sub = number1 -number2
                tvResult.text="Result$sub"
            }
        }

        btnmutltiply.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etnumber2.text.toString().equals("")){
                Toast.makeText(baseContext,"Enter Number",Toast.LENGTH_LONG).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etnumber2.text.toString().toInt()
                var mutliply = number1 * number2
                tvResult.text="Result$mutliply"
            }
        }
        btnmodulus.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etnumber2.text.toString().equals("")){
                Toast.makeText(baseContext,"Enter Number",Toast.LENGTH_LONG).show()
            }
            else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etnumber2.text.toString().toInt()
                var modulus= number1 % number2
                tvResult.text="Result$modulus"
            }
        }

        }
    }




