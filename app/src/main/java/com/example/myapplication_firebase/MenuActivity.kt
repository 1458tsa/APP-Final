package com.example.myapplication_firebase

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    private val travelNames = arrayOf("新娘里肌","火鍋","明太子雞肉","月見生牛肉")

    private val travelImageIds = arrayOf(R.drawable.bridalinnermuscle,

        R.drawable.hotpot,
        R.drawable.mentaikochickenlegs,
        R.drawable.tsukimijapaneserawbeef,)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val listView = findViewById<ListView>(R.id.listview90)

        val list = ArrayList<HashMap<String, Any>>()

        for (i in travelNames.indices) {

            val map = HashMap<String, Any>()

            map["travelName"] = travelNames[i]
            map["travelImage"] = travelImageIds[i]
            list.add(map)
        }

        val fromData = arrayOf("travelName", "travelImage")
        val toData = intArrayOf(R.id.textView60, R.id.imageView)

        val simpleAdapter = SimpleAdapter(this, list, R.layout.list_row_items, fromData, toData)
        listView.adapter = simpleAdapter
    }
}
