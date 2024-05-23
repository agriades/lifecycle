package com.sparta.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sparta.lifecycle.databinding.ActivityMainBinding

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}