package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    var cl0: ConstraintLayout? = null
    var cl1: ConstraintLayout? = null
    var cl2: ConstraintLayout? = null
    var cl3: ConstraintLayout? = null
    var cl4: ConstraintLayout? = null
    var cl5: ConstraintLayout? = null
    var cl6: ConstraintLayout? = null
    var cl7: ConstraintLayout? = null
    var cl8: ConstraintLayout? = null
    var cl9: ConstraintLayout? = null
    var clPlus: ConstraintLayout? = null
    var clMinus: ConstraintLayout? = null
    var clMultiply: ConstraintLayout? = null
    var clDivide: ConstraintLayout? = null
    var clEqual: ConstraintLayout? = null
    var clClear: ConstraintLayout? = null
    var tvResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
    }

    private fun initializeView() {
        cl0 = findViewById(R.id.cl_activity_main_0)
        cl1 = findViewById(R.id.cl_activity_main_1)
        cl2 = findViewById(R.id.cl_activity_main_2)
        cl3 = findViewById(R.id.cl_activity_main_3)
        cl4 = findViewById(R.id.cl_activity_main_4)
        cl5 = findViewById(R.id.cl_activity_main_5)
        cl6 = findViewById(R.id.cl_activity_main_6)
        cl7 = findViewById(R.id.cl_activity_main_7)
        cl8 = findViewById(R.id.cl_activity_main_8)
        cl9 = findViewById(R.id.cl_activity_main_9)
        clPlus = findViewById(R.id.cl_activity_main_plus)
        clMinus = findViewById(R.id.cl_activity_main_minus)
        clMultiply = findViewById(R.id.cl_activity_main_multiply)
        clDivide = findViewById(R.id.cl_activity_main_divide)
        clEqual = findViewById(R.id.cl_activity_main_equal)
        clClear = findViewById(R.id.cl_activity_main_clear)
        tvResult = findViewById(R.id.tv_activity_main_result)
    }
}