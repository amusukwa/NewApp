package com.example.newapp


import android.R
import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.iid.FirebaseInstanceIdReceiver
import com.google.firebase.messaging.EnhancedIntentService
import com.google.firebase.messaging.FirebaseMessagingService


class MyFirebaseInstanceIdService: FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        // Get updated InstanceID token.
      //  val refreshedToken: String =  FirebaseInstanceId.getInstance().getToken()
       // Log.d(TAG, "Refreshed token: $refreshedToken")

       // sendRegistrationToServer(refreshedToken)

    }

    private fun sendRegistrationToServer(refreshedToken: String) {

//        val reference = FirebaseDatabase.getInstance().reference
//        reference.child(getString(R.string.dbnode_users))
//            .child(FirebaseAuth.getInstance().currentUser!!.uid)
//            .child(getString(R.string.field_messaging_token))
//            .setValue(token)

    }

}