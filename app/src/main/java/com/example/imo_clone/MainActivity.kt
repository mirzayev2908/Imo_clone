package com.example.imo_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.setLayoutManager(GridLayoutManager(this,1))

        refreshAdapter(getAllChats())

    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this,chats)
        recyclerView!!.adapter = adapter
    }

    private fun getAllChats():ArrayList<Chat>{
        val chats:ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
        chats.add(Chat(R.mipmap.img,"Shaxzod Mirzayev",5))
            return chats
    }
}