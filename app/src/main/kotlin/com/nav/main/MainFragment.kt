package com.nav.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.nav.R
import com.nav.databinding.FragmentMainBinding


class MainFragment: Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        initViews()
    }

    private fun initViews() = with(binding) {
        val navHost = childFragmentManager.findFragmentById(R.id.tabs_container) as NavHostFragment
        val controller = navHost.navController

        NavigationUI.setupWithNavController(bottomNavigationView, controller)
    }
}