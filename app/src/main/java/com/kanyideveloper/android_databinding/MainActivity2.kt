package com.kanyideveloper.android_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kanyideveloper.android_databinding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2)

        binding.btnClick.setOnClickListener {
            //binding.text1.text = binding.addText.editableText.toString()

            val mod = Model(binding.addText.editableText.toString())

            binding.model2 = mod
        }
    }
}