package com.kanyideveloper.android_databinding

import android.content.Context
import android.hardware.input.InputManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.kanyideveloper.android_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val myModel = Model("Joel Kanyi")

        binding.model = myModel

        binding.myButton.setOnClickListener {

            binding.myText.text = binding.editName.editableText.toString()
        }
    }
}