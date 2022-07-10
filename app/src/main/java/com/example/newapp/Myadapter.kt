package com.example.newapp

import android.content.ContentValues
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener

class Myadapter (private val mentorArray: ArrayList<Mentor>): RecyclerView.Adapter<Myadapter.MyViewHolder>() {
    private lateinit var docRef: DatabaseReference



    public class MyViewHolder(itemView: ViewGroup): RecyclerView.ViewHolder(itemView){

        val name: TextView = itemView.findViewById(R.id.name_text)
        val proficiency: TextView = itemView.findViewById(R.id.proficiency_text)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem,parent,false)
        return MyViewHolder(itemView as ViewGroup)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mentor:Mentor = mentorArray[position]
        holder.name.text = mentor.name
        holder.proficiency.text = mentor.proficiency


    }

    override fun getItemCount(): Int {
        return mentorArray.size
    }


}