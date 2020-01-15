package com.example.navitagationcontrollerexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navitagationcontrollerexample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myName:MyName = MyName("Sevki Cetiner")
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

        startActivity(Intent(this, Main2Activity::class.java))

        done.setOnClickListener {
            myName.nickname = edittext.text.toString()
            binding.invalidateAll()
        }

    }
}
