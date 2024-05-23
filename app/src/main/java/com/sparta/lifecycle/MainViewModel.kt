package com.sparta.lifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class MainViewModel: ViewModel() {
    private val _textInput: MutableLiveData<String> = MutableLiveData() //LiveData와 MVVM은 친구 친구!
    val textInput: LiveData<String> get() = _textInput

    fun saveTextInputScope(text: String){
        viewModelScope.launch{
            _textInput.postValue(text)
        }
    }

    fun saveTextInput(text: String){
        _textInput.postValue(text)
    }
}