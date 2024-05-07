package com.example.froutlistview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val desc: Array<String>,
    private val imageId: Array<Int>
) :ArrayAdapter<String>(context,R.layout.activity_frouts_items, title){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val fruitView = inflater.inflate(R.layout.activity_frouts_items,parent,false)

        val titleTxt = fruitView.findViewById<TextView>(R.id.fruitName)
        val descTxt = fruitView.findViewById<TextView>(R.id.fruitDesc)
        val image = fruitView.findViewById<ImageView>(R.id.fruitImg)

        titleTxt.text = title[position]
        descTxt.text = desc[position]
        image.setImageResource(imageId[position])

        return fruitView
    }

}