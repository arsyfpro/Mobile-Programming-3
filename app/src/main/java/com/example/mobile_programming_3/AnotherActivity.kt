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
            if (intent.hasExtra("extra_name_parcel")) {
                val userNameParcel: NameParcel? = intent.getParcelableExtra("extra_name_parcel")

                binding.etFirstName.text = userNameParcel?.firstName
                binding.etLastName.text = userNameParcel?.lastName
            } else if (intent.hasExtra("extra_name_serial")) {
                val userNameSerial: NameSerial = intent.getSerializableExtra("extra_name_serial") as NameSerial

                binding.etFirstName.text = userNameSerial.firstName
                binding.etLastName.text = userNameSerial.lastName
            } else {
                val firstName = bundle.getString("extra_fname")
                val lastName = bundle.getString("extra_lname")

                binding.etFirstName.text = firstName
                binding.etLastName.text = lastName
            }
        }

    }
}