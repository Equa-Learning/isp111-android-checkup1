package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RecoverOkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recoverok)
    }

    fun toLogin(view: View) {
        val intent = Intent(this@RecoverOkActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }


}