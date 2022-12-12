package com.example.recyclerview.adaper

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R


/**
 * ViewHolder pattern
 * To reuse view reference multiple items.
 * Optionally, you can connect he data with view.
 * @param view Item_Layout reference
 */
class PersonViewHolder(
    private val view: View): RecyclerView.ViewHolder(view) {
        val itemFirstName: TextView =
            view.findViewById(R.id.item_first_name)
        val itemLastName: TextView =
            view.findViewById(R.id.item_last_name)

}