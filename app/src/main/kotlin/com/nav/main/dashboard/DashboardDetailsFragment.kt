package com.nav.main.dashboard

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.addOnBackPressedCallback


class DashboardDetailsFragment: Fragment(R.layout.fragment_dashboard_details) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        addOnBackPressedCallback {
            findNavController().popBackStack()
        }
    }
}