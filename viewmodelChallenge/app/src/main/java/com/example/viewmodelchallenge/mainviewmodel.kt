package com.example.viewmodelchallenge

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainviewmodel(startingTotal:Int): ViewModel()  {
     var total=MutableLiveData<Int>()

    init {
        total.value=startingTotal
    }

//    fun gettotal(): MutableLiveData<Int> {
//        return total
//    }
    fun settotal(number: Int)
    {
        total.value=(total.value)?.plus(number)
//        return total
    }



}