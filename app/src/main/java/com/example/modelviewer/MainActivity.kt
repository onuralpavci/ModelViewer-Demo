package com.example.modelviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modelviewer.databinding.ActivityMainBinding
import com.example.modelviewer.utils.viewbinding.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
