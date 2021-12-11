package com.example.diaryapp

class Diary (val key:String, val title:String, val date:String){

    companion object{
        var lastDiaryId=0
        fun createEntry(numDiaries: Int) : ArrayList<Diary>{
            val diaries = ArrayList<Diary>()
            for(i in 1..numDiaries){
                diaries.add(Diary("Key: " + lastDiaryId++, "Title", "Date"))
            }
            return diaries
        }
    }
}