package com.example.rechner

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HistoryActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.history_activity)

        val history = intent.getStringExtra("history")

        val textView: TextView = findViewById(R.id.history_textView)

        textView.setText(history.toString())

    }
}