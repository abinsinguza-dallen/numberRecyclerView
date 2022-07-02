package com.ron.numbersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ron.numbersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numbersList=Addition(100)
        print(numbersList)
        binding.rvNumber.layoutManager=LinearLayoutManager(this)
        binding.rvNumber.adapter=NumberRecyclerViewAdaptor(numbersList)

    }

    fun Addition (size:Int):List<Int>{

        var list = ArrayList<Int>()
        var num1 = 1
        var num2 = 0
        var b = 0
        while (b <= size) {
            print(num1)
            var sum = num1 + num2
            num1 = num2
            num2 = sum
            b++
            list += sum
        }
        return list
    }
}