package com.example.exempelgithub2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var x : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setX(45)
    }
    
    fun setX(x: Int){
        this.x = x

        println(x)
    }
}