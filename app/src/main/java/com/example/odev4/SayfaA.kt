package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.odev4.databinding.ActivitySayfaABinding

class SayfaA : AppCompatActivity() {
    private lateinit var tasarim: ActivitySayfaABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaABinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitSayfaB.setOnClickListener {
            val intent = Intent(this@SayfaA, SayfaB::class.java)
            startActivity(intent)
        }
    }
}