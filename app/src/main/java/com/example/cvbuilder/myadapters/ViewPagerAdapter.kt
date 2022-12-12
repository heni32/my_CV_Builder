package com.example.cvbuilder.myadapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private var myFragmentList: ArrayList<Fragment> = ArrayList()
    private var myFragmentTitleList: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return myFragmentList.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return myFragmentTitleList.get(position)
    }

    override fun getCount(): Int {
        return myFragmentList.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        myFragmentList.add(fragment)
        myFragmentTitleList.add(title)
    }
}
