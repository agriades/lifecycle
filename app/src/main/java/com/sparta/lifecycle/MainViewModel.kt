package com.sparta.lifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _input: MutableLiveData<String> = MutableLiveData() //LiveData와 MVVM은 친구 친구!
    val input: LiveData<String> get() = _input

    fun saveBeforeStop(text: String){
        _input.value = text
    }
}