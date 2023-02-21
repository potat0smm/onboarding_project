package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.onboarding.R


@Suppress("DEPRECATION")
class SplashScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            if (onBoardingStarted()){
                findNavController().navigate(R.id.action_splashScreen_to_loginFragment)
            }
            else{
                findNavController().navigate(R.id.action_splashScreen_to_viewPageFragment)
            }
            //findNavController().navigate(R.id.action_splashScreen_to_viewPageFragment)
        },3000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }
    private fun onBoardingStarted(): Boolean{
        val sharedPref = requireActivity().getSharedPreferences("", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Started",false)
    }
}