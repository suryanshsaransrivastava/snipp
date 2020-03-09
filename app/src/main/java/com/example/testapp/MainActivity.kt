package com.techhue.android

import android.app.Activity
import android.os.Bundle
import android.view.Menu

class MyActivity : Activity() {
    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
}