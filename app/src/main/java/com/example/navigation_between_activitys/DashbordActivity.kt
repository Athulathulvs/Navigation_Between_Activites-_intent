package com.example.navigation_between_activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation_between_activitys.databinding.ActivityDashbordBinding

class DashbordActivity : AppCompatActivity() {
    lateinit var binding: ActivityDashbordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashbordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        val username =intent.getStringExtra("USERNAME")
        val password =intent.getStringExtra("PASSWORD")
        val age = intent.getIntExtra("AGE",20)

        binding.txtUserinfo.text ="Username is $username\nPassword is $password \n age is $age"
    }
}