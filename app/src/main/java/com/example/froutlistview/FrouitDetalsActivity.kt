package com.example.froutlistview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class FrouitDetalsActivity : AppCompatActivity() {
    lateinit var fruitName: TextView
    lateinit var fruitDesc: TextView
    lateinit var fruitImg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_frouit_detals)
        fruitName = findViewById(R.id.fruitName)
        fruitDesc = findViewById(R.id.fruitDesc)
        fruitImg = findViewById(R.id.fruitImg)

        val name = intent.getStringExtra("name")
        val desc = intent.getStringExtra("desc")
        val imgResId = intent.getIntExtra("image", R.drawable.apple)

        fruitName.text = name
        fruitDesc.text = desc
        fruitImg.setImageResource(imgResId)
    }
}