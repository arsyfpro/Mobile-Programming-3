package com.example.mobile_programming_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile_programming_3.databinding.ActivityAnotherBinding

class AnotherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnotherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnotherBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val bundle: Bundle? = intent.extras

        if (bundle != null) {
            val firstName = bundle.getString("extra_fname")
            val lastName = bundle.getString("extra_lname")

            binding.etFirstName.text = firstName
            binding.etLastName.text = lastName
        }

    }
}