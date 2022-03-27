package com.cmj.daggerhilttrain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("fun1") strFun2: String
) : ViewModel() {

    private val _testWord = MutableLiveData<String>()
    val testWord: LiveData<String> = _testWord

    init {
        _testWord.value = strFun2
    }
}