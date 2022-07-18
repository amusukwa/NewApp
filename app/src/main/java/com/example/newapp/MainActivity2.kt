package com.example.newapp

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var loginbtn: Button

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            // reload();
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val loginbtn: Button = findViewById(R.id.login)



// Initialize Firebase Auth
        auth = Firebase.auth



    }


    fun addUser(view: View) {
        val emailtxt: EditText = findViewById<EditText>(R.id.email)
        val passwordtxt: EditText = findViewById<EditText>(R.id.password)

      val email = emailtxt.text.toString()
       val password = passwordtxt.text.toString()



        auth.createUserWithEmailAndPassword(email.toString(), password.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }
            }
    }

    private fun updateUI(user: FirebaseUser?) {
        if(user!== null){}
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        else{
           Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show() 
        }
    }

    fun add(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}