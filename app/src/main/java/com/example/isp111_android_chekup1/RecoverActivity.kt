package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RecoverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recover)
    }

    fun doRecover(view: View) {
        val intent = Intent(this@RecoverActivity, RecoverOkActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun toLogin(view: View) {
        val intent = Intent(this@RecoverActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }


}