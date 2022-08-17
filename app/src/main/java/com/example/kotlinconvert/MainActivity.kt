package com.example.kotlinconvert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlinconvert.adapters.ViewPagerAdapter
import com.example.kotlinconvert.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewPagerAdapter = ViewPagerAdapter(
            supportFragmentManager
        )
        mBinding.viewPager.adapter = viewPagerAdapter
        mBinding.tablayout.setupWithViewPager(mBinding.viewPager)
    }
}