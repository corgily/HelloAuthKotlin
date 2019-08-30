package com.corgily.example.helloauthkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val userEditText = findViewById<EditText>(R.id.userEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val messageTextView = findViewById<TextView>(R.id.messageTextView)

        loginButton.setOnClickListener {
            if (userEditText.text.toString() == "corgily" && passwordEditText.text.toString() == "password") {
                val successActivity = Intent(applicationContext, SuccessActivity::class.java)
                successActivity.putExtra(
                    "com.corgily.example.helloauth.name",
                    userEditText.text.toString()
                )
                messageTextView.text = ""
                startActivity(successActivity)

            } else {
                messageTextView.text = getString(R.string.tryagain)
            }
        }

    }
}
