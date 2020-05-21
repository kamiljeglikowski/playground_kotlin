package com.piwnicaprogramisty.playground.movable_view

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.piwnicaprogramisty.playground.R

class MovableContentActivity : AppCompatActivity() {

    var dX = 0f
    var dY = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_moveable_content);

        val imageView = findViewById<ImageView>(R.id.ivRedAndroid);

        imageView.setOnTouchListener { view, motionEvent ->
            handleImageTouch(
                view = view,
                event = motionEvent
            )
        }
    }

    private fun handleImageTouch(view: View, event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                dX = view.x - event.rawX
                dY = view.y - event.rawY
            }

            MotionEvent.ACTION_MOVE -> {
                view.animate()
                    .x(event.rawX + dX)
                    .y(event.rawY + dY)
                    .setDuration(0)
                    .start()
            }
            else -> return false
        }
        return true
    }
}