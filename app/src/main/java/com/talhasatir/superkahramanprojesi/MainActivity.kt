package com.talhasatir.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.talhasatir.superkahramanprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun userCreate(view : View){
        val name = binding.nameText.text.toString() // text verileri string olarak gelir.
        //val age = binding.ageText.text.toString().toInt()
        var age = binding.ageText.text.toString().toIntOrNull()
        val job = binding.jobText.text.toString()

        age = age ?: 0

        val superKahraman = SuperKahraman(name,age!!,job)

        binding.resultText.text = "Name: ${superKahraman.name}, Age: ${superKahraman.age},  Job: ${superKahraman.job}"
    }

}