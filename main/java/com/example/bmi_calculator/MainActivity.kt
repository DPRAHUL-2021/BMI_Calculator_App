package com.example.bmi_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmi_calculator.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            calculateBMI()
        }
    }

    private fun calculateBMI(){
        val weight = binding.weightEdit.text.toString().toDoubleOrNull()
        val height = binding.heightEdit.text.toString().toDoubleOrNull()
        val age = binding.ageEdit.text.toString().toIntOrNull()

        if(weight != null && height != null)
        {
            val bmi = weight/(height/100).pow(2)
            val bmiResult = String.format("%.2f",bmi)

            val bmiCategory = when {
                bmi < 18.5 -> "Underweight"
                bmi < 25 -> "Normal"
                bmi < 30 -> "Overweight"
                else -> "Obese"
            }
            navigateToResultActivity(bmiResult, bmiCategory)
        }
        else{
            Toast.makeText(this, "Please enter a valid weight and height", Toast.LENGTH_SHORT).show()
        }
    }

    private fun navigateToResultActivity(bmiResult: String, bmiCategory: String) {
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra("BMI_RESULT", bmiResult)
            putExtra("BMI_CATEGORY", bmiCategory)
        }
        startActivity(intent)
    }
}