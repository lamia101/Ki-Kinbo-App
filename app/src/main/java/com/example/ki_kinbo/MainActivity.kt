package com.example.ki_kinbo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    val database = FirebaseDatabase.getInstance()
    val databaseRef = database.getReference("Products")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeProdcut1: CardView= findViewById(R.id.homeProdcut1)
        homeProdcut1.setOnClickListener {
            val i=Intent(this,ViewProduct::class.java)
            intent.putExtra("Headphone", "Headphoneid")
            startActivity(i)
        }
    }
}