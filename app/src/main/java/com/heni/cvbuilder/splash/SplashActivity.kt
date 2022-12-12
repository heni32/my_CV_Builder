package com.heni.cvbuilder.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.heni.cvbuilder.MainActivity
import com.example.cvbuilder.R
import java.lang.Thread.sleep

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        Thread {
            sleep(4000)
            goToLoginActivity()
        }.start()
    }

    private fun goToLoginActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}