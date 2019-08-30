package com.corgily.example.helloauthkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_success.*

class SuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val logoutButton = findViewById<Button>(R.id.logoutButton)
        val successTextView = findViewById<TextView>(R.id.successTextView)

        val success =
            getString(R.string.hello) + " " + intent.getStringExtra("com.corgily.example.helloauth.name")
        successTextView.text = success

        logoutButton.setOnClickListener {
            val mainActivity = Intent(applicationContext, MainActivity::class.java)
            mainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(mainActivity)
            finish()
        }

    }
}
