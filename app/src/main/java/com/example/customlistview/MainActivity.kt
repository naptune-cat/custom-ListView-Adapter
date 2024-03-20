package com.example.customlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val name= arrayOf("Sam","Bailey Cooper","Arya","Alie","Piepie")

        val msg = arrayOf("Hii","I'll brb","Let's meet!","Awesome","call me when you are free")

        val lastseen = arrayOf("6:25am","9:00am","11:30pm","6:24pm","11:11pm")

        val phone = arrayOf("1234567890","2233445566","1971484783","5656565656","940723341")

        val img = intArrayOf(R.drawable.pfp1,R.drawable.pfp2,R.drawable.pfp3,R.drawable.pfp4,R.drawable.piupiu)

        userArrayList = ArrayList()
        for(eachIndex in name.indices){
            val user = User(name[eachIndex], msg[eachIndex],lastseen[eachIndex],phone[eachIndex],img[eachIndex])
            userArrayList.add(user)
        }

        val listview = findViewById<ListView>(R.id.listview)
        listview.adapter = MyAdapter(this,userArrayList)
        
        listview.setOnItemClickListener { parent, view, position, id ->
            //open a new activity
            val username = name[position]
            val userPhone = phone[position]
            val userImg = img[position]

            val intent = Intent(this,userActivity::class.java)
            intent.putExtra("name",username)
            intent.putExtra("phone",userPhone)
            intent.putExtra("Image",userImg)
            startActivity(intent)
        }

    }
}