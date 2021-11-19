package com.nav.oauth

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.databinding.FragmentSignInBinding

class SignInFragment: Fragment(R.layout.fragment_sign_in) {

    private lateinit var binding: FragmentSignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)

        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btnMain.setOnClickListener {
            Toast.makeText(requireContext(), "Not yet implemented", Toast.LENGTH_SHORT).show()
        }

        btnSignUp.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.pushToSignUp())
        }

        btnVerification.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.pushToVerification())
        }
    }
}