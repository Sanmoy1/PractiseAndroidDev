package com.example.viewmodelchallenge

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewmodel:mainviewmodel
    private lateinit var factory:mainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        factory= mainViewModelFactory(10)

        viewmodel= ViewModelProvider(this,factory).get(mainviewmodel::class.java)
        binding.textView.text=viewmodel.gettotal().toString()


        binding.button.setOnClickListener{

            viewmodel.settotal(binding.editTextNumber.text.toString().toInt())
            binding.textView.text=viewmodel.gettotal().toString()
        }

    }

}