package com.example.notificationexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    private val tag = "FirebaseMessagingService"
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.i(tag, remoteMessage.from.toString())

        if (remoteMessage.notification != null) {
            this.showNotification("9999",
            remoteMessage.notification?.title.toString(),
            remoteMessage.notification?.body.toString())
        }
    }
}
