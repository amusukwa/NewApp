package com.example.newapp

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.latin.TextRecognizerOptions

class PicActivity : AppCompatActivity() {
    lateinit var Imageuri: Uri
    lateinit var imageView: ImageView
    lateinit var image: InputImage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)
        val addbutton: Button = findViewById(R.id.add)
        val upLoad: Button = findViewById(R.id.upload)


    }

//    val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
//    val  getContent = registerForActivityResult(ActivityResultContracts
//        .GetContent()){uri: Uri?-> uri?.let { imageView-> }}
//
////    try{
////        image = fromFilePath(context, Uri)
////    }
////    catch (e: IOException) {
////        e.printStackTrace()
////    }
//
//
//
//
//    fun addPics(view: View) {
//        getContent.launch("image/*")
//    }
//
//
//    val result = recognizer.process(image)
//        .addOnSuccessListener { visionText ->
//            // Task completed successfully
//            // ...
//        }
//        .addOnFailureListener { e ->
//            // Task failed with an exception
//            // ...
//        }
//
//

}