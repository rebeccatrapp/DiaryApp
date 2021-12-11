package com.example.diaryapp

import androidx.recyclerview.widget.DiffUtil

class DiaryDiffUtil: DiffUtil.ItemCallback<Diary>() {
    override fun areItemsTheSame(oldItem: Diary, newItem: Diary)=
        oldItem==newItem

    override fun areContentsTheSame(oldItem: Diary, newItem: Diary)=
        oldItem.key == newItem.key && oldItem.title == newItem.title && oldItem.date == newItem.date
}