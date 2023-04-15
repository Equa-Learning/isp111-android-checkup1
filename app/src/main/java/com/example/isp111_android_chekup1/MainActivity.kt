package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toLogin(view: View) {
        var intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun toRegistragion(view: View) {
        var intent = Intent(this@MainActivity, RegActivity::class.java)
        startActivity(intent)
        finish()
    }
}