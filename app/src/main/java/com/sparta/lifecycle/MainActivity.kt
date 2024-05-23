package com.sparta.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sparta.lifecycle.databinding.ActivityMainBinding

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}