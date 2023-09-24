package com.example.mobile_programming_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile_programming_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Explicit intent to move to another activity
        binding.moveActivity.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, AnotherActivity::class.java)
            startActivity(moveIntent)
        }

        // Explicit intent to move to another activity with data
        binding.moveActivityData.setOnClickListener {
            val firstName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()

            val moveWithDataIntent = Intent(this@MainActivity, AnotherActivity::class.java)

            moveWithDataIntent.putExtra("extra_fname", firstName)
            moveWithDataIntent.putExtra("extra_lname", lastName)

            startActivity(moveWithDataIntent)
        }

        // Implicit content to call a phone number
        binding.callUser.setOnClickListener {
            val contactData = binding.etContactNumber.text

            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$contactData"))
            startActivity(dialPhoneIntent)
        }
    }
}