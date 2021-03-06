package com.nav.oauth

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.nav.BaseFragment
import com.nav.R
import com.nav.databinding.FragmentSignInBinding

class SignInFragment: BaseFragment(R.layout.fragment_sign_in) {

    private lateinit var binding: FragmentSignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)

        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btnMain.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.pushToMain())
        }

        btnSignUp.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.pushToSignUp())
        }

        btnVerification.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.pushToVerification())
        }

        btnArgs.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.pushToArgs())
        }
    }
}