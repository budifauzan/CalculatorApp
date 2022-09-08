package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

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
    private var btnPlus: Button? = null
    private var btnMinus: Button? = null
    private var btnMultiply: Button? = null
    private var btnDivide: Button? = null
    private var btnClear: Button? = null
    private var btnEqual: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
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
        btnPlus = findViewById(R.id.btn_activity_main_plus)
        btnMinus = findViewById(R.id.btn_activity_main_minus)
        btnMultiply = findViewById(R.id.btn_activity_main_multiply)
        btnDivide = findViewById(R.id.btn_activity_main_divide)
        btnClear = findViewById(R.id.btn_activity_main_clr)
        btnEqual = findViewById(R.id.btn_activity_main_equal)
    }
}