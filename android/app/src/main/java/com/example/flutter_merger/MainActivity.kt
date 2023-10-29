package com.example.flutter_merger

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    // Handler function for Button 1
    private fun button1Clicked() {
        // Your code for Button 1's action goes here
        val switchActivityIntent = Intent(this, FlutterActivity::class.java)
        startActivity(switchActivityIntent)
    }

    // Handler function for Button 2
    private fun button2Clicked() {
        val switchActivityIntent = Intent(this, RNActivity::class.java)
        startActivity(switchActivityIntent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Creating view with container
        setContentView(R.layout.main_activity_layout)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        // Set a click listener for Button 1
        button1.setOnClickListener {
            button1Clicked()
        }

        // Set a click listener for Button 2
        button2.setOnClickListener {
            button2Clicked()
        }
    }
}

