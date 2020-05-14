package com.piwnicaprogramisty.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// As you can see you can use "const val" and "val" at top of the file
const val constOnTop = "piwnicaprogramisty.pl"
val valueOnTop = "piwnicaprogramisty.pl"

class MainActivity : AppCompatActivity() {

    // As you can see, you can't use "const val" in class
    const val constInClass = "piwnicaprogramisty.pl"

    // But you can use val in class
    val valInClass: String = "piwnicaprogramisty.pl"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val someAssignedValue = "piwnicaprogramisty.pl"

        // As you can see, this variable value was assigned and you couldn't do this again
        someAssignedValue = "piwnicaprogramisty.pl"

        val someNotAssignedValue: String;

        // As you can see, this variable value was assigned and you couldn't do this again
        someNotAssignedValue = "piwnicaprogramisty.pl"

    }

    companion object {

        // this "const val" that is known at compile-time
        const val knownConstValue = "piwnicaprogramisty.pl"

        // this "const val" is not known at compile time and you could not compile this project
        const val notKnownConstValue = getSomeStringValue()

        // "val" did not need to be known at compile time
        val notKnownValue = getSomeStringValue()

        fun getSomeStringValue() : String = "piwnicaprogramisty.pl"
    }
}
