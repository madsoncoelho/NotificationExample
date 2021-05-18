package com.example.notificationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.btnSendNotification)
        btnSend.setOnClickListener {
            this.showNotification(
                "9999", "Exemplo de Notificação Local", "Corpo da Notificação Local")
        }

        Log.i("**newToken", FirebaseInstanceId.getInstance().token.toString())
    }
}