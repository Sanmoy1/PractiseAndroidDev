package com.example.viewmodelchallenge

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class mainViewModelFactory(private val startingTotal: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(mainviewmodel::class.java))
        {
            return mainviewmodel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}