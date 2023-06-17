package com.example.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class Primera : Activity() {

    override fun onCreate(savedInstanceState: Bundle?)     {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_activity)
    }

    override fun onResume()     {
        super.onResume()

        Toast.makeText( this, "HOLA, esta es la primer activity ", Toast.LENGTH_LONG).show()

        //
       // val intent = Intent(Intent.ACTION_VIEW)
       // intent.data = Uri.parse("https://www.google.com")
       // startActivity(intent)
    }
}