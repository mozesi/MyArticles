package com.kauzganga.myarticles.holders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kauzganga.myarticles.R

class ListHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    private val firstNameTextView: TextView = itemView.findViewById<TextView>(R.id.first_name)
    private val lastNameTextView: TextView = itemView.findViewById<TextView>(R.id.last_name)

    fun updateNames(fName:String, Lname:String){

        firstNameTextView.text =fName
        lastNameTextView.text =Lname
    }


}