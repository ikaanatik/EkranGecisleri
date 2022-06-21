package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4.databinding.ActivityMainBinding
import com.example.odev4.databinding.ActivitySayfaBBinding

class SayfaB : AppCompatActivity() {
    private lateinit var tasarim: ActivitySayfaBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaBBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitSayfaBtoY.setOnClickListener {
            val intent = Intent(this@SayfaB, SayfaY::class.java)
            startActivity(intent)
        }
    }
}