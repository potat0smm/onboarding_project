package com.example.myapplication.onboarding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.screen.FirstScreen
import com.example.myapplication.screen.SecondScreen
import com.example.myapplication.screen.ThirdScreen
import com.example.onboarding.R

class ViewPageFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_page, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPageAdapter(fragmentList,requireActivity().supportFragmentManager,
        lifecycle)

        view.findViewById<ViewPager2>(R.id.viewPager).adapter = adapter

        return view
    }


}