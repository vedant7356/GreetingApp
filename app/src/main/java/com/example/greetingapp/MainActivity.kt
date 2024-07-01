package com.example.greetingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var greetingTextView: TextView
    private lateinit var customGreetingEditText: EditText
    private lateinit var changeGreetingButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextView = findViewById(R.id.greetingTextView)
        customGreetingEditText = findViewById(R.id.customGreetingEditText)
        changeGreetingButton = findViewById(R.id.changeGreetingButton)

        changeGreetingButton.setOnClickListener {
            setCustomGreeting()
        }
    }

    private fun setCustomGreeting() {
        val customGreeting = customGreetingEditText.text.toString()
        if (customGreeting.isNotBlank()) {
            greetingTextView.text = customGreeting
        } else {
            greetingTextView.text = "Hello, World!"
        }
    }
}
