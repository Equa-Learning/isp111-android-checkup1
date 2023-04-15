package com.example.isp111_android_chekup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class RegActivity : AppCompatActivity() {

    lateinit var mail: EditText
    lateinit var pass: EditText
    lateinit var pass2: EditText

    val pattern = ("[a-zA-Z0-6]{1,30}" + "@" + "[a-z]{1,8}" + "\\." + "[a-z]{1,5}")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        mail = findViewById(R.id.login_email)
        pass = findViewById(R.id.login_pass)
        pass2 = findViewById(R.id.login_pass2)
    }

    fun isEmailValid(text: String): Boolean {
        return Pattern.compile(pattern).matcher(text).matches()
    }
    fun toMain(view: View) {
        val intent = Intent(this@RegActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun doRegistration(view: View) {
        if (mail.text.toString().isNotEmpty()
            && pass.text.toString().isNotEmpty()
            && pass2.text.toString().isNotEmpty()
        ) {
            if (pass.text.toString() != pass2.text.toString()) {
                Toast.makeText(this, "Пароль и повтор не совпадают", Toast.LENGTH_SHORT).show()
                return
            }
            if (!isEmailValid(mail.text.toString())) {
                Toast.makeText(this, "ошибка при заполнении поля Email", Toast.LENGTH_SHORT).show()
                return
            }
            val intent = Intent(this@RegActivity, PatchActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            val alert = AlertDialog.Builder(this)
                .setTitle("Не все поля заполнены")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }

    }

}