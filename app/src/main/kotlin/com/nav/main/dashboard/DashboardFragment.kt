package com.nav.main.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import base.BaseLifecycleFragment
import com.nav.R
import com.nav.databinding.FragmentDashboardBinding


class DashboardFragment: BaseLifecycleFragment(R.layout.fragment_dashboard) {

    private lateinit var binding: FragmentDashboardBinding
    private val viewModel: DashboardViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)
        viewModel.viewModelScope
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btnDetails.setOnClickListener {
            findNavController().navigate(DashboardFragmentDirections.pushToDetails())
        }

        btnTabs.setOnClickListener {

        }
    }
}