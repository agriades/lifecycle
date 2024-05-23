package com.sparta.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.sparta.lifecycle.databinding.ActivityMainBinding

// onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.et.setText(Variables.input) //이렇게 선언하니 에러가 떴다! 냅다 "hello" 했을 땐 괜찮았는데.
    //출력 시에는 binding.et.text가 가능하지만, 반대는 안된다.
    }

    override fun onStop() {
            super.onStop()
            Variables.input = binding.et.text.toString()
            Log.d("agriades", Variables.input)
        }

}