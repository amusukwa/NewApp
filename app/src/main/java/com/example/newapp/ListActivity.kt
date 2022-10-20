package com.example.newapp

import android.content.ContentValues
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import com.google.firebase.firestore.FirebaseFirestore

class ListActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var projectsArray: ArrayList<Projects>
    private lateinit var docRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        projectsArray = arrayListOf()



        recyclerview = findViewById<RecyclerView>(R.id.mentor_recycler)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        var adapter = Myadapter(projectsArray)
        recyclerview.adapter = Myadapter(projectsArray)

         getMentor()


    }

    private fun getMentor() {
        val db = FirebaseFirestore.getInstance()
        db.collection("projects").get().addOnSuccessListener {
            result-> for (document in result){
                Log.d(TAG,"${document.id} =>${document.data}")
            }
        }.addOnFailureListener{
            Log.d(TAG,"error getting document")
        }

//        docRef = FirebaseDatabase.getInstance().getReference("mentors")
//        docRef.addValueEventListener(object:ValueEventListener{
//            override fun onDataChange(snapshot: DataSnapshot) {
//                if(snapshot.exists()){
//                    for(mentorSnapshot in snapshot.children){
//                        val mentor = snapshot.getValue(Mentor::class.java)
//                        mentorArray.add(mentor!!)
//                    }
//                    recyclerview.adapter = Myadapter(mentorArray)
//                }
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {
//                Log.w(ContentValues.TAG, "loadPost:onCancelled", databaseError.toException())
//            }
//
//
//
//        })
//        val mentorListener = object: ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//
//                if(snapshot.exists()){
//                    for(mentorSnapshot in snapshot.children){
//                        val mentor = snapshot.getValue(Mentor::class.java)
//                        mentorArray.add(mentor!!)
//                    }
//                    recyclerview.adapter = Myadapter(mentorArray)
//                }
//            }
//            //docRef.addValueEventListener(mentorListener)
//
//            override fun onCancelled(databaseError: DatabaseError) {
//                Log.w(ContentValues.TAG, "loadPost:onCancelled", databaseError.toException())
//            }
//
//
//        }

    }



}