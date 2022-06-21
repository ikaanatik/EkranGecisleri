package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4.databinding.ActivitySayfaBBinding
import com.example.odev4.databinding.ActivitySayfaXBinding

class SayfaX : AppCompatActivity() {
    private lateinit var tasarim: ActivitySayfaXBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaXBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitSayfaXtoY.setOnClickListener {
            val intent = Intent(this@SayfaX, SayfaY::class.java)
            startActivity(intent)
        }
    }
}