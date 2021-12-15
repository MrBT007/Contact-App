package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var name = intent.getStringExtra("Name")
        var number = intent.getLongExtra("Phone Number",0)
        var nametext = findViewById<TextView>(R.id.intName)
        var numtext = findViewById<TextView>(R.id.intNum)

        nametext.text = "Name : $name"
        numtext.text = "Phone Number : ${number}"
    }
}