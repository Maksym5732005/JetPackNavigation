package com.nav.main.profile

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import base.BaseLifecycleFragment
import com.nav.R
import com.nav.databinding.FragmentProfileBinding
import com.nav.main.MainFragmentDirections


class ProfileFragment: BaseLifecycleFragment(R.layout.fragment_profile) {

    private lateinit var binding: FragmentProfileBinding
    private val viewModel: ProfileViewModel by viewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.viewModelScope
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btnDetails.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.pushToProfileDetails())
        }

        btnExternalDetails.setOnClickListener {
            findTopNavController().navigate(MainFragmentDirections.pushToExternalProfileDetails())
        }
    }

    private fun Fragment.findTopNavController(): NavController {
        val topLevelFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.main_container)
        val topLevelHost = topLevelFragment as NavHostFragment?
        return topLevelHost?.navController ?: throw IllegalStateException("Top controller is not found")
    }
}