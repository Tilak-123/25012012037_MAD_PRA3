package com.example.a25012012037_mad_pra3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate back to Login Activity
        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            finish() // Returns to LoginActivity if opened from there
        }

        // Register Button Click
        findViewById<Button>(R.id.btnRegister).setOnClickListener {
            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()
            // Redirect to Login Page after "entering details"
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}