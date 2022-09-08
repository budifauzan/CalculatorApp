package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {

    private var btn0: Button? = null
    private var btn1: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    private var btn4: Button? = null
    private var btn5: Button? = null
    private var btn6: Button? = null
    private var btn7: Button? = null
    private var btn8: Button? = null
    private var btn9: Button? = null
    private var btnDot: Button? = null
    private var btnPlus: Button? = null
    private var btnMinus: Button? = null
    private var btnMultiply: Button? = null
    private var btnDivide: Button? = null
    private var btnClear: Button? = null
    private var btnEqual: Button? = null
    private var tvResult: TextView? = null

    private var isDotUsed = false
    private var lastNumeric = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
        setOnClick()
        inputNumber(btn0)
        inputNumber(btn1)
        inputNumber(btn2)
        inputNumber(btn3)
        inputNumber(btn4)
        inputNumber(btn5)
        inputNumber(btn6)
        inputNumber(btn7)
        inputNumber(btn8)
        inputNumber(btn9)
        inputOperator(btnPlus)
        inputOperator(btnMinus)
        inputOperator(btnMultiply)
        inputOperator(btnDivide)
    }

    private fun initializeView() {
        btn0 = findViewById(R.id.btn_activity_main_0)
        btn1 = findViewById(R.id.btn_activity_main_1)
        btn2 = findViewById(R.id.btn_activity_main_2)
        btn3 = findViewById(R.id.btn_activity_main_3)
        btn4 = findViewById(R.id.btn_activity_main_4)
        btn5 = findViewById(R.id.btn_activity_main_5)
        btn6 = findViewById(R.id.btn_activity_main_6)
        btn7 = findViewById(R.id.btn_activity_main_7)
        btn8 = findViewById(R.id.btn_activity_main_8)
        btn9 = findViewById(R.id.btn_activity_main_9)
        btnDot = findViewById(R.id.btn_activity_main_dot)
        btnPlus = findViewById(R.id.btn_activity_main_plus)
        btnMinus = findViewById(R.id.btn_activity_main_minus)
        btnMultiply = findViewById(R.id.btn_activity_main_multiply)
        btnDivide = findViewById(R.id.btn_activity_main_divide)
        btnClear = findViewById(R.id.btn_activity_main_clr)
        btnEqual = findViewById(R.id.btn_activity_main_equal)
        tvResult = findViewById(R.id.tv_activity_main_result)
    }

    private fun setOnClick() {
        btnClear?.setOnClickListener {
            tvResult?.text = ""
            lastNumeric = false
            isDotUsed = false
        }
        btnEqual?.setOnClickListener {
            if (tvResult?.text != "") {
                calculate()
            }
        }
        btnDot?.setOnClickListener {
            if (lastNumeric && !isDotUsed) {
                tvResult?.append(".")
                lastNumeric = false
                isDotUsed = true
            }
        }
    }

    private fun inputNumber(button: Button?) {
        button?.setOnClickListener {
            tvResult?.append(button.text)
            lastNumeric = true
        }
    }

    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/") ||
                    value.contains("*") ||
                    value.contains("+") ||
                    value.contains("-")
        }
    }

    private fun inputOperator(button: Button?) {
        button?.setOnClickListener {
            tvResult?.text?.let {
                if (lastNumeric && !isOperatorAdded(it.toString())) {
                    tvResult?.append(button.text)
                    lastNumeric = false
                    isDotUsed = false
                }
            }
        }
    }


    private fun calculate() {
        if (lastNumeric) {
            try {
                val operation = tvResult?.text.toString()
                when {
                    operation.contains("-") -> {
                        val splitValue = operation.split("-")
                        val x = splitValue[0]
                        val y = splitValue[1]
                        tvResult?.text =
                            removeZeroAfterDot((x.toDouble() - y.toDouble()).toString())
                    }
                    operation.contains("+") -> {
                        val splitValue = operation.split("+")
                        val x = splitValue[0]
                        val y = splitValue[1]
                        val result = removeZeroAfterDot((x.toDouble() + y.toDouble()).toString())
                        tvResult?.text = result
                    }
                    operation.contains("*") -> {
                        val splitValue = operation.split("*")
                        val x = splitValue[0]
                        val y = splitValue[1]
                        tvResult?.text =
                            removeZeroAfterDot((x.toDouble() * y.toDouble()).toString())
                    }
                    operation.contains("/") -> {
                        val splitValue = operation.split("/")
                        val x = splitValue[0]
                        val y = splitValue[1]
                        tvResult?.text =
                            removeZeroAfterDot((x.toDouble() / y.toDouble()).toString())
                    }
                }

            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }
        }
    }

    private fun removeZeroAfterDot(result: String): String {
        var value = result
        if (result.contains(".0")) {
            value = result.substring(0, result.length - 2)
        }
        return value
    }

}