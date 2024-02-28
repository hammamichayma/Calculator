package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var  display:TextView
    private lateinit var edit1:EditText
    private lateinit var edit2:EditText
    private lateinit var add:Button
    private lateinit var sub:Button
    private lateinit var multiply1:Button
    private lateinit var div:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display=findViewById(R.id.display_result)
        edit1=findViewById(R.id.number1)
        edit2=findViewById(R.id.number2)
        add=findViewById(R.id.btn_add)
        sub=findViewById(R.id.btn_sub)
        multiply1=findViewById(R.id.btn_multiply)
        div=findViewById(R.id.btn_div)




        add.setOnClickListener {

            val res1= edit1.text.toString().toInt()
            val res2= edit2.text.toString().toInt()
            addition(res1, res2)
        }
        sub.setOnClickListener {

            val res1= edit1.text.toString().toInt()
            val res2= edit2.text.toString().toInt()
            subtraction(res1, res2)
        }
        multiply1.setOnClickListener {

            val res1= edit1.text.toString().toInt()
            val res2= edit2.text.toString().toInt()
            multiplication(res1, res2)
        }

        div.setOnClickListener {

            val res1= edit1.text.toString().toInt()
            val res2= edit2.text.toString().toInt()
            division(res1, res2)
        }

    }

    private fun addition(res1:Int ,res2:Int){
        val result=res1+res2
        display.text=result.toString()
    }
    private fun subtraction(res1:Int ,res2:Int){
        val result=res1-res2
        display.text=result.toString()
    }
    private fun multiplication(res1:Int ,res2:Int){
        val result=res1*res2
        display.text=result.toString()
    }
    private fun division(res1:Int ,res2:Int){
        val result=res1/res2
        display.text=result.toString()
    }
}