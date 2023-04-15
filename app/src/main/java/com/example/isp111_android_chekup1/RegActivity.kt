package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
    }

    fun toMain(view: View) {
        val intent = Intent(this@RegActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun doRegistration(view: View) {
        val intent = Intent(this@RegActivity, PatchActivity::class.java)
        startActivity(intent)
        finish()
    }

}