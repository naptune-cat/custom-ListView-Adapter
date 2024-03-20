package com.example.customlistview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (val context: Activity,val arrayList: ArrayList<User>) : ArrayAdapter<User>(context ,R.layout.each_item, arrayList) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_item,null)
        val image = view.findViewById<ImageView>(R.id.img)
        val name = view.findViewById<TextView>(R.id.name)
        val msg = view.findViewById<TextView>(R.id.msg)
        val lastseen = view.findViewById<TextView>(R.id.lastseen)

        name.text = arrayList[position].name
        msg.text=arrayList[position].lastmsg
        lastseen.text =   arrayList[position].lastseen
        image.setImageResource(arrayList[position].img)
        return view
    }
}