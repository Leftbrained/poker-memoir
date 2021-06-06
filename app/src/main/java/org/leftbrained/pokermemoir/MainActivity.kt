package org.leftbrained.pokermemoir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val EXTRA_START_SESSION = "org.leftbrained.pokermemoir.START_SESSION"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createSession(view: View) {
        val startSession = true
        val intent = Intent(this, SessionCreateActivity::class.java).apply {
            putExtra(EXTRA_START_SESSION, startSession)
        }
        startActivity(intent)
    }
}
