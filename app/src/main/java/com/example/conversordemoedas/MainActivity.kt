package com.example.conversordemoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertonclick(view: View){
        val dolar  = editText.text.toString() .toDouble()
        var real = dolar *5

        textView.text = real.toString()
    }
}
