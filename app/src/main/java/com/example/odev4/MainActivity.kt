package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


    tasarim.buttonGitSayfaA.setOnClickListener{
        val intent = Intent(this@MainActivity,SayfaA::class.java)
        startActivity(intent)
    }
        tasarim.buttonGitSayfaX.setOnClickListener{
            val intent = Intent(this@MainActivity,SayfaX::class.java)
            startActivity(intent)
        }



    }
}