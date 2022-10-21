package com.example.newapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.ContentValues.TAG
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class FirebaseCloudMessaging: FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        Log.d(TAG,"Refreshed token:$token")
        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // FCM registration token to your app server.
       // sendRegistrationToServer(token)


    }


       override fun onMessageReceived(remoteMessage: RemoteMessage) {

        var notificationBody = ""
        var notificationTitle = ""
        var notificationData = ""
        try {
            notificationData =  remoteMessage.data.toString()
            notificationTitle = remoteMessage.data.toString()
            notificationBody = remoteMessage.notification.toString()
        } catch (e: NullPointerException) {

            Log.e(TAG,"onMessageReceived: NullPointerException:" + e.message)
        }

        Log.d(TAG,"onMessageReceived: data: $notificationData")
        Log.d(TAG,"onMessageReceived: notification body $notificationBody")

        Log.d(TAG,"onMessageReceived:$notificationTitle")



        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val NOTIFICATION_CHANNEL_ID = "Nilesh_channel"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                "Your Notifications",
                NotificationManager.IMPORTANCE_HIGH
            )

            notificationChannel.description = "Description"
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.RED
            notificationChannel.vibrationPattern = longArrayOf(0, 1000, 500, 1000)
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
        }


    }
}