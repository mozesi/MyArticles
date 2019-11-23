package com.kauzganga.myarticles

import ForecastListAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private val items = listOf("Moses Msukwa 1","Moses Msukwa 2","Moses Msukwa 3","Moses Msukwa 4",
        "Moses Msukwa 5","Moses Msukwa 6","Moses Msukwa 7","Moses Msukwa 8","Moses Msukwa 9","Moses Msukwa 1","Moses Msukwa 2","Moses Msukwa 3","Moses Msukwa 4",
        "Moses Msukwa 5","Moses Msukwa 6","Moses Msukwa 7","Moses Msukwa 8","Moses Msukwa 9","Final")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foreCastList = findViewById<RecyclerView>(R.id.forecast_list)

        foreCastList.layoutManager = LinearLayoutManager(this)
        foreCastList.adapter =ForecastListAdapter(items)
    }

}
