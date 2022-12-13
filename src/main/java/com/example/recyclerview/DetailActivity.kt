package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_FIRST_NAME = "EXTRA_FIRST_NAME"
        const val EXTRA_LAST_NAME = "EXTRA_LAST_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        intent.apply {
            val firstName = getStringExtra(EXTRA_FIRST_NAME)
            val lastName = getStringExtra(EXTRA_LAST_NAME)

            findViewById<TextView>(R.id.detail_first_name).text = firstName
            findViewById<TextView>(R.id.detail_last_name).text = lastName
        }
    }
}