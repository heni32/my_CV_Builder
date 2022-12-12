package com.example.cvbuilder

import android.content.DialogInterface
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.cvbuilder.fragment.AboutMeFragment
import com.example.cvbuilder.fragment.ContactFragment
import com.example.cvbuilder.fragment.HomeFragment
import com.example.cvbuilder.fragment.WorkFragment
import com.example.cvbuilder.myadapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        var viewpager = findViewById<ViewPager>(R.id.tab_viewpager)
        var tablayout = findViewById<TabLayout>(R.id.tab_tablayout)

        setSupportActionBar(toolbar)

        tablayout.setupWithViewPager(viewpager)

        setViewPager(viewpager)


    }


    private fun setViewPager(tabViewpager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(AboutMeFragment(), "About Me")
        adapter.addFragment(WorkFragment(), "Work")
        adapter.addFragment(ContactFragment(), "Contact")

        tabViewpager.adapter = adapter
    }



    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_gmail -> showMessage("Gmail")
        R.id.action_linkedIn -> showMessage("LinkedIn")
        R.id.action_whatsapp -> showMessage("Whatsapp")

        else -> super.onOptionsItemSelected(item)
    }

    private fun showMessage(s: String): Boolean {
        AlertDialog.Builder(this)
            .setTitle(s)
            .setMessage("Would you like to send a Message using $s Application")
            .setPositiveButton("Ok",DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            .create()
            .show()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}