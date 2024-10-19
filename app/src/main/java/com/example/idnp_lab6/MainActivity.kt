package com.example.idnp_lab6

import android.os.Bundle
import android.text.Layout
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutCatedral = findViewById<ConstraintLayout>(R.id.layoutCatedral);
        val layoutClaustro = findViewById<ConstraintLayout>(R.id.layoutClaustro);

        layoutCatedral.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, CatedralFragment())
                .addToBackStack(null)
                .commit()
        }

        layoutClaustro.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ClaustroFragment())
                .addToBackStack(null)
                .commit()
        }

    }
}