package com.sparta.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.sparta.lifecycle.databinding.ActivityMainBinding

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {

    //바인딩 initialization
    private var _binding: ActivityMainBinding? = null //nullable
    private val binding get() = _binding!! //non-nullable

    //Instance 내에 변수 생성
    var input: String = "" //null 에러 방지 위해 빈 String 설정

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰바인딩 설정
        _binding = ActivityMainBinding.inflate(layoutInflater)
        //바인딩 et.text에 input 넣어주기.
        val view = binding.root
        setContentView(view)
    }


    override fun onStop() {
        super.onStop()
        input = binding.et.text.toString() //et.text.toString()
        Log.d("agriades", input)
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}