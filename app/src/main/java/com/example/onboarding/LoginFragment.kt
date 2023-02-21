package com.example.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.onboarding.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var username: EditText
    private lateinit var password: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login,container,false)

      //  username = view.findViewById(R.id.email_log)
        //password = view.findViewById(R.id.password_log)

        return view
    }




}