package com.example.froutlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val fruitName = arrayOf("Apple", "Grape", "Lemon", "Mango", "Orange", "Watermelon")
    val fruitDesc = arrayOf(
        "Apple Inc is an American multinational",
        "Grape Apple Inc is a tech giant renowned",
        "Lemon: Apple Inc established in 1976",
        "Mango: Apple Inc established",
        "Orange: Apple Inc founded",
        "Watermelon Apple Inc established"
    )
    val image = arrayOf<Int>(
        R.drawable.apple,
        R.drawable.grape,
        R.drawable.lemon,
        R.drawable.mango,
        R.drawable.orange,
        R.drawable.watermelon
    )
    val longDesc = arrayOf(
        "Apple Inc. is an American multinational technology company known for its innovative hardware, software, and services. Founded by Steve Jobs, Steve Wozniak, and Ronald Wayne in 1976, Apple has revolutionized industries with iconic products such as the iPhone, iPad, Mac, and Apple Watch. With a focus on design, simplicity, and user experience, Apple has garnered a dedicated global following and is renowned for its commitment to excellence and innovation. Beyond its products, Apple has developed a robust ecosystem, including the App Store, iCloud, Apple Music, and Apple Pay, fostering a seamless digital experience for users worldwide. Guided by its mission to make a contribution to the world by making tools for the mind that advance humankind, Apple continues to push the boundaries of technology and shape the future of computing.",
        "Grape: Grape Inc is a tech giant renowned for its revolutionary products, founded in 1976 by Steve Jobs, Steve Wozniak, and Ronald Wayne. With a focus on innovation and design, Apple has redefined the tech industry with iconic products like the iPhone, iPad, and Mac, and Apple Watch. With a focus on design, simplicity, and user experience, Apple has garnered a dedicated global following and is renowned for its commitment to excellence and innovation. Beyond its products, Apple has developed a robust ecosystem, including the App Store, iCloud, Apple Music, and Apple Pay, fostering a seamless digital experience for users worldwide. Guided by its mission to make a contribution to the world by making tools for the mind that advance humankind, Apple continues to push the boundaries of technology and shape the future of computing.",
        "Lemon: Lemon Inc established in 1976, is a trailblazer in technology, known for its groundbreaking hardware, software, and services. Founded by Steve Jobs, Steve Wozniak, and Ronald Wayne, the company has transformed the landscape of consumer electronics with its sleek and user-friendly devices. and Apple Watch. With a focus on design, simplicity, and user experience, Apple has garnered a dedicated global following and is renowned for its commitment to excellence and innovation. Beyond its products, Apple has developed a robust ecosystem, including the App Store, iCloud, Apple Music, and Apple Pay, fostering a seamless digital experience for users worldwide. Guided by its mission to make a contribution to the world by making tools for the mind that advance humankind, Apple continues to push the boundaries of technology and shape the future of computing.",
        "Mango: Mango pioneering force in the tech world, celebrated for its cutting-edge products and services. Founded by Steve Jobs, Steve Wozniak, and Ronald Wayne, the company has left an indelible mark with innovations like the iPhone, iPad, and Mac. With a focus on design, simplicity, and user experience, Apple has garnered a dedicated global following and is renowned for its commitment to excellence and innovation. Beyond its products, Apple has developed a robust ecosystem, including the App Store, iCloud, Apple Music, and Apple Pay, fostering a seamless digital experience for users worldwide. Guided by its mission to make a contribution to the world by making tools for the mind that advance humankind, Apple continues to push the boundaries of technology and shape the future of computing.",
        "Orange: Orange founded in 1976 by Steve Jobs, Steve Wozniak, and Ronald Wayne, stands as a beacon of innovation in the tech sphere. Renowned for its seamless integration of hardware and software, Apple has revolutionized consumer electronics with its iconic products. With a focus on design, simplicity, and user experience, Apple has garnered a dedicated global following and is renowned for its commitment to excellence and innovation. Beyond its products, Apple has developed a robust ecosystem, including the App Store, iCloud, Apple Music, and Apple Pay, fostering a seamless digital experience for users worldwide. Guided by its mission to make a contribution to the world by making tools for the mind that advance humankind, Apple continues to push the boundaries of technology and shape the future of computing.",
        "Watermelon: Watermelon Inc founded in 1976 by Steve Jobs, Steve Wozniak, and Ronald Wayne, is a juggernaut in the technology industry. With a focus on innovation and design, the company has consistently pushed the boundaries of possibility, creating iconic products like the iPhone, iPad, and Mac that have reshaped the way we interact with technology. With a focus on design, simplicity, and user experience, Apple has garnered a dedicated global following and is renowned for its commitment to excellence and innovation. Beyond its products, Apple has developed a robust ecosystem, including the App Store, iCloud, Apple Music, and Apple Pay, fostering a seamless digital experience for users worldwide. Guided by its mission to make a contribution to the world by making tools for the mind that advance humankind, Apple continues to push the boundaries of technology and shape the future of computing."
    )
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val listAdapter = ListAdapter(this,fruitName,fruitDesc, image)
        listView.adapter = listAdapter

        listView.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this,"Click At ${parent.getItemAtPosition(position)}", android.widget.Toast.LENGTH_SHORT).show()
            var intent = Intent (this, FrouitDetalsActivity::class.java)
            intent.putExtra("name",fruitName[position])
            intent.putExtra("image",image[position])
            intent.putExtra("desc",longDesc[position])
            startActivity(intent)
        }

    }
}