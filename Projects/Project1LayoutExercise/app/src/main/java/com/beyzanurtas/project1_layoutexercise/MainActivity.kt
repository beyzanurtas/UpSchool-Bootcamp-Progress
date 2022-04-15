package com.beyzanurtas.project1_layoutexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.beyzanurtas.project1_layoutexercise.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

     init()
    }
    private fun init(){
        binding.startNow.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent= Intent(this@MainActivity, StartActivity::class.java)
        startActivity(intent)
    }
}