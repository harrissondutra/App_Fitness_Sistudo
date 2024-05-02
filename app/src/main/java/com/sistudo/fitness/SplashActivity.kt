package com.sistudo.fitness

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sistudo.fitness.databinding.ActivityMainBinding
import com.sistudo.fitness.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private val splashTime = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler: Handler = Handler()
        handler.postDelayed({
            toLogin()
        }, splashTime)


    }

    private fun toLogin() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}