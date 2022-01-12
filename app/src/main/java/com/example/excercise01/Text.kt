package com.example.excercise01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Text: ViewModel() {
    var text = MutableLiveData<String>().also {
        it.value = "Hello World!!"
    }

    var buttonEnabled = MutableLiveData<Boolean>().also {
        it.value = true
    }

    fun onClick() {
        text.value = "Button is Clicked!!"
        buttonEnabled.value = false
    }
}
