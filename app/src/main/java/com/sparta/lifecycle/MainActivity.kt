package com.sparta.lifecycle

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {

    val et = findViewById<EditText>(R.id.et)
    lateinit var input: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        super.onStop()
        input = et.text.toString()
    }

}