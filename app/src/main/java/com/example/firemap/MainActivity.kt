package com.example.firemap
import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import org.w3c.dom.Text
import org.gdal.gdal.gdal;
import org.gdal.gdal.Band;
import org.gdal.gdal.Dataset;
import android.content.res.AssetManager
import java.io.File


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mToolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mToolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.my_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        var selectedOption = ""
        when(item?.itemId) {
            R.id.action_change_map -> {
                val intent = Intent(this, SelectMap::class.java)
                startActivity(intent)
            }
        }
        when(item?.itemId) {
            R.id.action_qr -> {
                val intent = Intent(this, QR::class.java)
                startActivity(intent)
            }
        }
        return true
    }

}
