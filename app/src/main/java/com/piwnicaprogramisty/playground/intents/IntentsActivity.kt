package com.piwnicaprogramisty.playground.intents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.piwnicaprogramisty.playground.R

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        setTitle(R.string.intents_title)
        val btnOpenExplicit = findViewById<Button>(R.id.btn_open_explicit)
        val btnOpenImplicit = findViewById<Button>(R.id.btn_open_implicit)

        btnOpenExplicit.setOnClickListener { openExplicitIntent() }

        btnOpenImplicit.setOnClickListener { openImplicitIntent() }
    }

    fun openExplicitIntent() {
        val intent = Intent(
            this,
            ExplicitIntentActivity::class.java
        )

        startActivity(intent)
    }

    fun openImplicitIntent() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}