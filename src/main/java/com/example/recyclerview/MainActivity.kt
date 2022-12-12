package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.adaper.PersonAdapter
import com.example.recyclerview.adaper.createListOfPersons

class MainActivity : AppCompatActivity() {


    /**
    1.- Create a item_layout xml file
    2.- Create a subclass RecyclerView.ViewHolder()
    3.- Create a subclass of RecyclerView.Adapter()
    4.- Implement a layoutManager
     */


    private lateinit var personList: RecyclerView
    private lateinit var adapter: PersonAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personList = findViewById(R.id.person_list)
        adapter = PersonAdapter(createListOfPersons())

        personList.adapter =  adapter
        personList.layoutManager = selectLayoutManager()







    }

    private fun selectLayoutManager(): RecyclerView.LayoutManager {
        val linearLayoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false)

        val gridLayoutManager = GridLayoutManager(this,
            3)

        val staggeredGridLayoutManager = StaggeredGridLayoutManager(
            3, StaggeredGridLayoutManager.VERTICAL)

        return linearLayoutManager
    }


}