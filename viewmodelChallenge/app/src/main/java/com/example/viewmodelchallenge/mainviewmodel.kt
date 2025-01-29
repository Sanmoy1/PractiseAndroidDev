package com.example.viewmodelchallenge

import androidx.lifecycle.ViewModel

class mainviewmodel(startingTotal:Int): ViewModel()  {
    private var total=0

    init {
        total=startingTotal
    }

    fun gettotal(): Int {
        return total
    }
    fun settotal(number: Int)
    {
        total+=number
//        return total
    }



}