package com.example.myapplication.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.onboarding.R
import com.google.android.material.button.MaterialButton


class ThirdScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_screen, container, false)

        //val viewPage = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.findViewById<MaterialButton>(R.id.btn_one_start).setOnClickListener {
            findNavController().navigate(R.id.action_viewPageFragment_to_loginFragment)
            onBoardingGetStarted()
        }
        return view
    }
    private fun onBoardingGetStarted(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding",Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }

}