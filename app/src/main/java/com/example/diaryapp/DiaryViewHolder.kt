package com.example.diaryapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DiaryViewHolder(v: View) : RecyclerView.ViewHolder(v){
    val photo: ImageView
    val title: TextView
    val date: TextView

    init{
        photo = v.findViewById(R.id.photo)
        title = v.findViewById(R.id.title)
        date = v.findViewById(R.id.date)
    }

    fun bindTo(d: Diary){
        title.text = d.title
        date.text = d.date
    }
}