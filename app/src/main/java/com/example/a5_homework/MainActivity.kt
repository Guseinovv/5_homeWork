package com.example.a5_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a5_homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVP()
    }

    private fun initVP() {
        binding.viewPager.adapter = CountAdapter(supportFragmentManager)
    }
}