package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)
        var timer= object : CountDownTimer(2000,1000) {
            override fun onTick(millisUntilFinished: Long) {
                //
            }

            override fun onFinish() {
                var intent = Intent(this@LoadingActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        timer.start()
    }
}