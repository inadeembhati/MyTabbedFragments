package com.nadeem.mytabbedfragments.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class SectionsPagerAdapter( fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    private   lateinit var   mfragment  :ArrayList<Fragment>
    private   lateinit var   mfragmentTitleList  :ArrayList<String>

        fun addFragment(fragment: Fragment, title:String){
            mfragment.add(fragment)
            mfragmentTitleList.add(title)
        }
    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return mfragment.get(position)
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return mfragmentTitleList.get(position)
    }
    override fun getCount(): Int {
        // Show 2 total pages.
        return  mfragment.size
    }
}