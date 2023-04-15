package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    lateinit var mail: EditText
    lateinit var pass: EditText

    val pattern = ("[a-zA-Z0-6]{1,30}" + "@" + "[a-z]{1,8}" + "\\." + "[a-z]{1,5}")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mail = findViewById(R.id.login_email)
        pass = findViewById(R.id.login_pass)

    }

    fun isEmailValid(text: String): Boolean {
        return Pattern.compile(pattern).matcher(text).matches()
    }
    fun doLogin(view: View) {
        if (mail.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()) {
            if (isEmailValid(mail.text.toString())) {
                val intent = Intent(this@LoginActivity, PatchActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "ошибка при заполнении поля Email", Toast.LENGTH_SHORT).show()
            }
        } else {
            val alert = AlertDialog.Builder(this)
                .setTitle("Не все поля заполнены")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }

    fun toRecoverPassword(view: View) {
        val intent = Intent(this@LoginActivity, RecoverActivity::class.java)
        startActivity(intent)
        finish()
    }
}