package com.project.cleaarchitecureboilerplate.features.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.cleaarchitecureboilerplate.R
import com.project.cleaarchitecureboilerplate.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}