package com.nav.oauth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.databinding.FragmentResetPasswordBinding

class ResetPasswordFragment: Fragment(R.layout.fragment_reset_password) {

    private lateinit var binding: FragmentResetPasswordBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResetPasswordBinding.bind(view)

        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btnMainNew.setOnClickListener {
            findNavController().navigate(ResetPasswordFragmentDirections.pushToSignInNew())
        }

        btnMainOld.setOnClickListener {
            findNavController().navigate(ResetPasswordFragmentDirections.pushToSignInOld())
        }

        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}