package com.mixlr.panos.viewbindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mixlr.panos.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            val view = root
            setContentView(view)

            btnSubmit.setOnClickListener {
                val name = etPersonName.text.toString()
                tvMessage.text = "Hello $name"
                etPersonName.setText("")
            }
        }
    }
}