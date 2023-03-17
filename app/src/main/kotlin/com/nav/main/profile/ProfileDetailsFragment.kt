package com.nav.main.profile

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.addOnBackPressedCallback


class ProfileDetailsFragment : Fragment(R.layout.fragment_profile_details) {

    private val viewModel: ProfileDetailsViewModel by viewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.viewModelScope
        addOnBackPressedCallback {
            findNavController().popBackStack()
        }
    }
}