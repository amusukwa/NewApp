package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var docRef: DatabaseReference
    private lateinit var nameTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mentorbutton: Button = findViewById(R.id.add_mentor)
        //var nameText: TextView = findViewById(com.google.firebase.database.R.id.name)
    }

    fun addMentor(view: View) {
        val docRef = FirebaseDatabase.getInstance().getReference("mentors")

        val nametxt: EditText = findViewById<EditText>(R.id.name)
        val proficiencytxt: EditText = findViewById<EditText>(R.id.proficiency_edit)


        val name = nametxt.text.toString()
        val proficiency = proficiencytxt.text.toString()

        val mentor:Mentor = Mentor(name,proficiency)
        docRef.setValue(mentor)

    }
}