package com.example.form_workshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class bottom_nav : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        LoadFragment(home_fragment())
        val buttomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        buttomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> LoadFragment(home_fragment())
                R.id.setting -> LoadFragment(setting_fragment())
                R.id.profile -> LoadFragment(profile_fragment())
            }
            true
        }
    }
        private fun LoadFragment (fragment: Fragment){
            supportFragmentManager.beginTransaction().replace(R.id.container,fragment).commit()
        }
    }
