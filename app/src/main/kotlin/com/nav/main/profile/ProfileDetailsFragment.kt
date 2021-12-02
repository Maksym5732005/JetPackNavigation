package com.nav.main.profile

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.addOnBackPressedCallback


class ProfileDetailsFragment: Fragment(R.layout.fragment_profile_details) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        addOnBackPressedCallback {
            findNavController().popBackStack()
        }
    }
}