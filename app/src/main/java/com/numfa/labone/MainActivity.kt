package com.numfa.labone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Log.i("onCreate","Activity created")
        fab.setOnClickListener { view ->
            Log.i("onClick","FAB Clicked")
            Snackbar.make(view, "ทดสอบระบบ", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        button1.setOnClickListener { view ->
            Toast.makeText(this, "Hi", Toast.LENGTH_LONG).show()
            var i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume", "Activity resume")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                var i = Intent(this,Main2Activity::class.java)
                startActivity(i)
                return true
            }
            R.id.action_settings2 -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
