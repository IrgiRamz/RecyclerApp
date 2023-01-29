package com.example.recyclerapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class detail_food : AppCompatActivity() {

    companion object {
        const val EXTRA_detail = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_food)
        val imageview: ImageView = findViewById(R.id.detail_image)
        val detail_makanan: TextView = findViewById(R.id.detail_makanan)
        val detail_deskripsi: TextView = findViewById(R.id.detail_deskripsi)

        val intent = getIntent().getParcelableExtra<Foods>(EXTRA_detail)

        Glide.with(this).load(intent?.photo).into(imageview)
        detail_makanan.text = intent?.name
        detail_deskripsi.text = intent?.detail
    }
}
