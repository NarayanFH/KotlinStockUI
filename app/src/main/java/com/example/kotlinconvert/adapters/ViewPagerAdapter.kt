package com.example.kotlinconvert.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kotlinconvert.fragments.AllStocks
import com.example.kotlinconvert.fragments.Fifty2Week
import com.example.kotlinconvert.fragments.TopGainers
import com.example.kotlinconvert.fragments.TopLosers

class ViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        if (position == 0) fragment = AllStocks() else if (position == 1) fragment =
            TopLosers() else if (position == 2) fragment =
            TopGainers() else if (position == 3) fragment = Fifty2Week()
        return fragment!!
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) title = "All Stocks" else if (position == 1) title =
            "Top Gainers" else if (position == 2) title =
            "Top Losers" else if (position == 3) title = "52 Week"
        return title
    }
}