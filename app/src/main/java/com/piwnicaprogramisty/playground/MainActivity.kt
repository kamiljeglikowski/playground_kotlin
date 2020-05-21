package com.piwnicaprogramisty.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.piwnicaprogramisty.playground.intents.IntentsActivity
import com.piwnicaprogramisty.playground.movable_view.MovableContentActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnOpenIntents = findViewById<Button>(R.id.btnOpenIntents)
        var btnOpenMovableActivity = findViewById<Button>(R.id.btnOpenMovableActivity)

        btnOpenIntents.setOnClickListener { openIntents() }
        btnOpenMovableActivity.setOnClickListener { openMovable() }
    }

    private fun openIntents() {
        startActivity(Intent(this, IntentsActivity::class.java))
    }

    private fun openMovable() {
        startActivity(Intent(this, MovableContentActivity::class.java))
    }
}
