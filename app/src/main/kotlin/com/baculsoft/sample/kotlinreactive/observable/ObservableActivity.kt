package com.baculsoft.sample.kotlinreactive.observable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.baculsoft.sample.kotlinreactive.R
import org.jetbrains.anko.find
import org.jetbrains.anko.setContentView

class ObservableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ObservableUI().setContentView(this)
        setToolbar()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun setToolbar() {
        val toolbar = find<Toolbar>(R.id.toolbar_observable)
        toolbar.title = resources.getString(R.string.menu_observable)

        setSupportActionBar(toolbar)
    }
}