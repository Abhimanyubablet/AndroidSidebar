package com.example.form_workshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TabLayaout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layaout)

        val tabLayaout=findViewById<TabLayout>(R.id.tabLayout)
        val viewPager=findViewById<ViewPager>(R.id.framelayout)

        val adapter=TabAdpater(supportFragmentManager)
         adapter.addFragment(Chat(),"CHAT")
        adapter.addFragment(Status(),"STATUS")
        adapter.addFragment(Call(),"CALL")

        viewPager.adapter=adapter
        tabLayaout.setupWithViewPager(viewPager)
    }
}