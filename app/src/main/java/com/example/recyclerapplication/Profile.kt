package com.example.recyclerapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val Next = findViewById<Button>(R.id.next)

        Next.setOnClickListener {
            Toast.makeText(this,"RecycleView", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@Profile, MainActivity::class.java)
            startActivity(intent)
        }
    }
}