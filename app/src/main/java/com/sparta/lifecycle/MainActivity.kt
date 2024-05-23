package com.sparta.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {

    lateinit var input: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et = findViewById<EditText>(R.id.et)
    }

    override fun onStop() {
        super.onStop()
        input = "hello!" //et.text.toString()
        Log.d("agriades", input)
    }

}