package com.nadeem.mytabbedfragments

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.nadeem.mytabbedfragments.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val  TAG = "TABBED"
    lateinit var  mViewPager : ViewPager
     var  mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("TAG" ,"frag Before view Pager")
        toolbar.title = "Tab Layout"
        setSupportActionBar(toolbar)
        mViewPager = findViewById(R.id.view_pager)
        mViewPager.adapter = mSectionsPagerAdapter
        setupViewPager(mViewPager)
        tabs.setupWithViewPager(mViewPager)

    }


fun setupViewPager(viewPager: ViewPager){
    mSectionsPagerAdapter.addFragment(fragment = Tab1Fragment.Tab1newInstance(), title = "TAB1")
    mSectionsPagerAdapter.addFragment(fragment = Tab2Fragment.Tab2newInstance(), title = "TAB2")
    mSectionsPagerAdapter.addFragment(fragment = Tab3Fragment.Tab3newInstance(), title = "TAB3")
    Log.i("TAG" ,"frag added")
}

}