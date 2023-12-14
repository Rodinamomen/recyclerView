package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var userRecyclerView : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // (1)
        userRecyclerView= findViewById(R.id.rv_user)
        //(2)
      var Users : List<User> = listOf(User("Mohamed", 20),
            User("Ahmed", 21),User("Ali", 22),
            User("Mohamed ali", 20),
            User("Mohamed ahmed", 20),
            User("ahmed Mohamed", 20),
            User("Ali Mohamed", 20),
            User("Mohamed Ali", 20))
        // (3)
        var adapter = Adapter(Users)
        userRecyclerView.adapter= adapter
        userRecyclerView.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }
}