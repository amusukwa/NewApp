package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)
        val addbutton: Button = findViewById(R.id.add)

        val upLoad: Button = findViewById(R.id.upload)


    }

     fun addPic() {
        val  intent = Intent(this,
            ListActivity::class.java)
        startActivity(intent)
        Toast.makeText(this,"List Selected", Toast.LENGTH_SHORT).show()
    }

    fun upLoad(view: View) {}
    fun addPics(view: View) {}
}