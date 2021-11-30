package com.nav.main.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.databinding.FragmentDashboardBinding


class DashboardFragment: Fragment(R.layout.fragment_dashboard) {

    private lateinit var binding: FragmentDashboardBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)

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