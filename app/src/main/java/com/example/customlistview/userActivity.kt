package com.example.customlistview
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class userActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        val name = intent.getStringExtra("name")
        val phoneNum = intent.getStringExtra("phone")
        val img =  intent.getIntExtra("Image",R.drawable.pfp1)

        val nameTV = findViewById<TextView>(R.id.nameOfUser)
        val phoneTV = findViewById<TextView>(R.id.contactNum)
        val imageV = findViewById<ImageView>(R.id.img)
        nameTV.text= name
        phoneTV.text = phoneNum
        imageV.setImageResource(img)
    }
}