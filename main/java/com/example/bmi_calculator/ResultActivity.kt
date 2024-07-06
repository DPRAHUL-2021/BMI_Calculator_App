package com.example.bmi_calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.bmi_calculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bmiResult = intent.getStringExtra("BMI_RESULT")
        val bmiCategory = intent.getStringExtra("BMI_CATEGORY")

        binding.bmi.text = bmiResult
        binding.bmiCategory.text = bmiCategory

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}
