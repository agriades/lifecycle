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
        //어딘가에 저장되어 있던 binding.et.text 정보를 여기에서 binding.et.text에 다시 집어넣음.
    }

    override fun onStop() {
        super.onStop()
        //여기에 바깥으로 입력값 저장하는 코드 작성
    }
}