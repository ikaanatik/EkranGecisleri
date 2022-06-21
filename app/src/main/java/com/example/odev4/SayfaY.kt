package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4.databinding.ActivitySayfaBBinding
import com.example.odev4.databinding.ActivitySayfaYBinding

class SayfaY : AppCompatActivity() {
    private lateinit var tasarim: ActivitySayfaYBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaYBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGeriGit.setOnClickListener {
            val intent = Intent(this@SayfaY, MainActivity::class.java)
            startActivity(intent)
        }
    }
}