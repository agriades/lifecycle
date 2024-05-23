package com.sparta.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.sparta.lifecycle.databinding.ActivityMainBinding

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onStop() {
            super.onStop()
            input = binding.et.text.toString() //et.text.toString()
            Log.d("agriades", input)
        }

}