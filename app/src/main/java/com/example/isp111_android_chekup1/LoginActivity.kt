package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun doLogin(view: View) {
        val intent = Intent(this@LoginActivity, PatchActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun toRecoverPassword(view: View) {
        val intent = Intent(this@LoginActivity, RecoverActivity::class.java)
        startActivity(intent)
        finish()
    }
}