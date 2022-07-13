package com.example.newapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import java.net.URI
import java.text.SimpleDateFormat
import java.util.*

class PicActivity : AppCompatActivity() {
    lateinit var Imageuri: URI
   // private lateinit var storageReference: FirebaseStorage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)
        val addbutton: Button = findViewById(R.id.add)

        val upLoad: Button = findViewById(R.id.upload)


    }

    val  getContent = registerForActivityResult(ActivityResultContracts
        .GetContent()){uri: Uri?-> uri?.let { imageUri-> }}


    fun addPics(view: View) {
        getContent.launch("image/*")
    }


    fun upLoad(view: View) {

        val formatter = SimpleDateFormat("yyyy_mo_dd__min", Locale.ENGLISH)
        val now = Date()
        val fileName = formatter.format(now)
       // val storageReference = FirebaseStorage

    }
}