package com.sparta.lifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _textInput: MutableLiveData<String> = MutableLiveData() //LiveData와 MVVM은 친구 친구!
    val textInput: LiveData<String> get() = _textInput

    fun saveTextInput(text: String){
        _textInput.value = text
    }
}