package com.example.madpractical2_20012021045

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "on creat function called: ")
        Toast.makeText(this, "on creat function called:", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"create function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onstart function called: ")
        Toast.makeText(this, "onstart function called:", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onstart function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume function called: ")
        Toast.makeText(this, "onResume function called:", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onResume function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG, "onPause function called: ")
        Toast.makeText(this, "onPause function called:", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onPause function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop function called: ")
        Toast.makeText(this, "onStop function called:", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStop function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy function called: ")
        Toast.makeText(this, "onDestroy  function called:", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onDestroy  function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart function called: ")
        Toast.makeText(this, "onRestart function called:", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onRestart function called",Snackbar.LENGTH_LONG).show()
    }
}