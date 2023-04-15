package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class RecoverActivity : AppCompatActivity() {

    lateinit var mail: EditText

    val pattern = ("[a-zA-Z0-6]{1,30}" + "@" + "[a-z]{1,8}" + "\\." + "[a-z]{1,5}")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recover)
        mail = findViewById(R.id.login_email)

    }

    fun isEmailValid(text: String): Boolean {
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun doRecover(view: View) {
        if (mail.text.toString().isNotEmpty()
        ) {
            if (!isEmailValid(mail.text.toString())) {
                Toast.makeText(this, "ошибка при заполнении поля Email", Toast.LENGTH_SHORT).show()
                return
            }
            val intent = Intent(this@RecoverActivity, RecoverOkActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            val alert = AlertDialog.Builder(this)
                .setTitle("Не заполнено поле Email")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }

    }
    fun toLogin(view: View) {
        val intent = Intent(this@RecoverActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }


}