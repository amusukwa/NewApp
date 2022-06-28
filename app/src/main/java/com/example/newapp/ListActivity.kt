package com.example.newapp

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class ListActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var mentorArray: ArrayList<Mentor>
    private lateinit var docRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        mentorArray = arrayListOf()



       // recyclerview = findViewById<RecyclerView>(com.google.firebase.database.R.id.mentor_recycler)
       // recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        var adapter = Myadapter(mentorArray)

        docRef = FirebaseDatabase.getInstance().getReference("mentors")



    }
    val mentorListener = object: ValueEventListener {
        override fun onDataChange(snapshot: DataSnapshot) {

            if(snapshot.exists()){
                for(mentorSnapshot in snapshot.children){
                    val mentor = snapshot.getValue(Mentor::class.java)
                    mentorArray.add(mentor!!)
                }
                recyclerview.adapter = Myadapter(mentorArray)
            }
        }

        override fun onCancelled(databaseError: DatabaseError) {
            Log.w(ContentValues.TAG, "loadPost:onCancelled", databaseError.toException())
        }
        //  docRef.addValueEventListener(mentorListener)

    }

}