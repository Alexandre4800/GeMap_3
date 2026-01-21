package com.alexandre.gemap

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("google.navigation:q=Avenida Paulista")
        )
        intent.setPackage("com.google.android.apps.maps")
        startActivity(intent)
        finish()
    }
}
