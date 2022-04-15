package com.beyzanurtas.project1_layoutexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.beyzanurtas.project1_layoutexercise.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_start)

        init()
    }
    private fun init(){
        binding.signIn.setOnClickListener(this)
        binding.signUpText.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id){
            binding.signIn.id -> {
                val intent=Intent(this@StartActivity,PremiumActivity::class.java)
                startActivity(intent)
            }
            binding.signUpText.id -> {
                val intent= Intent(this@StartActivity,SignUpActivity::class.java)
                startActivity(intent)
            }
        }

    }
}