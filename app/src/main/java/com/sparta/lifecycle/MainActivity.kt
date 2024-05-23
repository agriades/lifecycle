package com.sparta.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        Variables.input = R.id.et
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}