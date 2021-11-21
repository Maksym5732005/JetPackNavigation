package com.nav.oauth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.databinding.FragmentVerificationBinding


class VerificationFragment : Fragment(R.layout.fragment_verification) {

    private lateinit var binding: FragmentVerificationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVerificationBinding.bind(view)

        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btnCode.setOnClickListener {
            findNavController().navigate(VerificationFragmentDirections.pushToResetPassword())
        }

        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}