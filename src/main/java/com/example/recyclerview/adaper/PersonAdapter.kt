package com.example.recyclerview.adaper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R



class PersonAdapter(
    private val dataSet: List<Person>,
    private val openDetails:(Person) -> Unit):
    RecyclerView.Adapter<PersonViewHolder>() {

    /**
     * Create the defined ViewHolder from the Generics
     * @param parent: ViewGroup -> View Container (item_layout)
     * @param ViewType:Int -> The current VH.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {

        return PersonViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.person_item_layout,
                parent,
                false
            )

        )
    }
    /**
     * Connect the view with the date
     * @param posiion: index position of he data
     */
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.itemFirstName.text = dataSet[position].firsName
        holder.itemLastName.text = dataSet[position].lastName
        holder.itemView.setOnClickListener {
            openDetails(dataSet[position])
        }

    }
    /**
     * Return N number of items
     */
    override fun getItemCount(): Int {
        return dataSet.size
    }


}