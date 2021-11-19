package com.nav.args

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.nav.R
import com.nav.databinding.FragmentArgsBinding


class ArgsFragment: Fragment(R.layout.fragment_args) {

    private lateinit var binding: FragmentArgsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArgsBinding.bind(view)

        initListeners()
    }

    private fun initListeners() = with(binding) {

    }
}