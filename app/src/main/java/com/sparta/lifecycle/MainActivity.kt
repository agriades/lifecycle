package com.sparta.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sparta.lifecycle.databinding.ActivityMainBinding

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}