package com.sparta.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.sparta.lifecycle.databinding.ActivityMainBinding

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    //private var input = Variables.input

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //binding.et.setText(input)//출력 시에는 binding.et.text가 가능하지만, 반대는 안된다.

        //ViewModel observe 적용 구간
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java] //가 정석 형식.
        //val viewModel = MainViewModel by viewModels() by viewModels는 build.gradle에 라이브러리 디펜던시를 추가해야 함.
        viewModel.textInput.observe(this) {textInput ->
            Log.d("agriades", textInput) }
    }

    override fun onStop() {
            super.onStop()
            //input = binding.et.text.toString()
            //Log.d("agriades", input)
        }

}