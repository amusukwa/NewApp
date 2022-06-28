package com.example.newapp

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter: RecyclerView.Adapter<Myadapter.MyViewHolder>() {



    public class MyViewHolder(itemView: ViewGroup): RecyclerView.ViewHolder(itemView){

        val name: TextView = itemView.findViewById(R.id.name_text)
        val proficiency: TextView = itemView.findViewById(R.id.proficiency_text)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}