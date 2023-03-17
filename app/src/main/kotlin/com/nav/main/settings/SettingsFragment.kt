package com.nav.main.settings

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import base.BaseLifecycleFragment
import com.nav.R


class SettingsFragment: BaseLifecycleFragment(R.layout.fragment_settings) {

    private val viewModel: SettingsViewModel by viewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.viewModelScope
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.check()
    }
}