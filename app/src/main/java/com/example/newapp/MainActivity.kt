package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
   // private lateinit var docRef: DatabaseReference
    private lateinit var nameTxt: TextView
    //private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mentorbutton: Button = findViewById(R.id.add_mentor)
        // val vm =  ViewModelProviders.of(this{MainActivityViewModel::class.java})
    }

    fun addMentor(view: View) {
        //val dcRef = FirebaseDatabase.getInstance().getReference().child("mentors")
        val db = FirebaseFirestore.getInstance()

        val nametxt: EditText = findViewById<EditText>(R.id.name)
        val description: EditText = findViewById<EditText>(R.id.proficiency_edit)
        val project_creator: EditText = findViewById<EditText>(R.id.project_creator)


        val name = nametxt.toString()
        val proficiency = description.text.toString()
        val projectcreator = project_creator.text.toString()

        //val project: = Projects(name,proficiency)
       // docRef.setValue(mentor)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mentorlist_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){R.id.action_mentolist->{
            val  intent = Intent(this,
                ListActivity::class.java)
            startActivity(intent)
                Toast.makeText(this,"List Selected", Toast.LENGTH_SHORT).show()
            }R.id.action_home->{
            val  intent = Intent(this,
                PicActivity::class.java)
            startActivity(intent)
                Toast.makeText(this,"List", Toast.LENGTH_SHORT).show()
            }


        }
        return super.onOptionsItemSelected(item)
    }
}