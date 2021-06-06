package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number1 = findViewById<EditText>(R.id.etNumber1)
        var number2 = findViewById<EditText>(R.id.etNumber2)
        var result = findViewById<TextView>(R.id.etAnswer)
        var add = findViewById<Button>(R.id.addBTn)
        var subtract=findViewById<Button>(R.id.subBtn)
        var multiply=findViewById<Button>(R.id.multBtn)
        var modulus=findViewById<Button>(R.id.modBtn)


        add.setOnClickListener {

            if (number1.text.toString().isEmpty() ){
                    number1.setError("This field is empty")
            }
                else if(number2.text.toString().isEmpty()){
                    number2.setError("This field is empty")
                }
            else {
                var num1 = number1.text.toString().toInt()
                var num2 = number2.text.toString().toInt()
                var addResult = num1 + num2
                result.text = "Answer: ${addResult}"
            }
        }
        subtract.setOnClickListener {
            if (number1.text.toString().isEmpty() ){
                number1.setError("This field is empty")
            }
           else if(number2.text.toString().isEmpty()) {
                number2.setError("This field is empty")
            }
            else
            {
                var num1 = number1.text.toString().toInt()
                var num2 = number2.text.toString().toInt()
                var subtractResult = num1 - num2
                result.text = "Answer: ${subtractResult}"
            }
            multiply.setOnClickListener {
                if (number1.text.toString().isEmpty() ){
                    number1.setError("This field is Empty")
                }
                else if(number2.text.toString().isEmpty()) {
                    number2.setError("This field is Empty")
                }
                else
                {
                    var num1 = number1.text.toString().toInt()
                    var num2 = number2.text.toString().toInt()
                    var multiplyResult = num1 * num2
                    result.text = "Answer: ${multiplyResult}"
                }

            }
            modulus.setOnClickListener {
                if (number1.text.toString().isEmpty()) {
                    number1.setError("This field is empty")
                }
                else if(number2.text.toString().isEmpty()){
                    number2.setError("This field is empty")
                }
                else
                {
                    var num1 = number1.text.toString().toInt()
                    var num2 = number2.text.toString().toInt()
                    var remainder = num1 % num2
                    result.text = "Answer: ${remainder}"
                }
            }

        }
//                var num1 = number1.text.toString().toInt()
//            var num2 = number2.text.toString().toInt()
//            var addResult = num1 + num2
//            if(number1.text.toString() == "") {
//                number1.setError("This field is empty")
////               Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()
//            } else if (number2.text.toString() == ""){
//                //Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()}
//            else {
//                var num1 = number1.text.toString().toInt()
//                var num2 = number2.text.toString().toInt()
//                var addResult = num1 - num2
//                result.text = "Answer: ${addResult}"
//            }
//        }
//        subtract.setOnClickListener {
//            if(number2.text.toString() == "") {
//                Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()
//            } else if (number2.text.toString() == ""){
//                Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()}
//            else {
//                var num1 = number1.text.toString().toInt()
//                var num2 = number2.text.toString().toInt()
//                var subtractResult = num1 - num2
//                answer.text = "Answer:${subtractResult}"
//            }
//        multiply.setOnClickListener {
//            if(number1.text.toString() == "") {
//                Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()
//            } else if (number2.text.toString() == ""){
//                Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()}
//            else {
//                var num1 = number1.text.toString().toInt()
//                var num2 = number2.text.toString().toInt()
//                var multiplyResult = num1 * num2
//                answer.text = "Answer:${multiplyResult}"
//            }
//        }
//        modulus.setOnClickListener {
//            if(number2.text.toString() == "") {
//                Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()
//            } else if (number2.text.toString() == ""){
//                Toast.makeText(baseContext,"This field is empty",Toast.LENGTH_SHORT).show()}
//            else {
//                var num1 = number1.text.toString().toInt()
//                var num2 = number2.text.toString().toInt()
//                var remainder = num1 % num2
//                answer.text = "Answer:${remainder}"
//            }
//        }
    }
    }