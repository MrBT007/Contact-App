package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val contacts = arrayOf(Contact("Tushar",123456789),
                                Contact("Narendra Modi",99874545412),
                                Contact("Elon Musk",487974571),
                                Contact("Mota bhai (Ambani)",99979447845),
                                Contact("Jay",945667822),
                                Contact("Divyesh",487445472),
                                Contact("Ankit bhai",8905674365),
                                Contact("Sahil P",904156624),
                                Contact("Vismay",784115445),
                                Contact("Trushal",454879461),
                                Contact("Sohil",998454215),
                                Contact("Om",366684975),
                                Contact("Viraj",797974464),
                                Contact("M O Bhut",8128760099),
                                Contact("D Z Bhut",8200029854),
                                Contact("Hiren",8999741124),
                                Contact("Vivek",9979744774),
                                Contact("Mota Bapa",9978554447),
                                Contact("Pappa",756710549),
                                Contact("Nayan",999778545),
                                Contact("Bhuvan Bam",987745866))
        val ad = CustomAdapter(contacts)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        recyclerView.adapter = ad
    }
}