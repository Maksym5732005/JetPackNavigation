package com.nav.args

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.databinding.FragmentArgsBinding

const val ARGS_FRAGMENT_REQUEST_KEY = "ARGS_FRAGMENT_REQUEST_KEY"
const val ARGS_FRAGMENT_RESULT_NUMBER = "RESULT_NUMBER"

class ArgsFragment: Fragment(R.layout.fragment_args) {

    private lateinit var binding: FragmentArgsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArgsBinding.bind(view)

        initListeners()
        registerBackResultListener()
    }

    private fun initListeners() = with(binding) {
        btnSendArgs.setOnClickListener {
            val intArg = if (chipNumber.isChecked) 77 else 0
            val colorArg = if (chipColor.isChecked) R.color.teal_200 else 0
            findNavController().navigate(ArgsFragmentDirections.pushToArgsResult(intArg, colorArg))
        }
    }

    private fun registerBackResultListener() {
        setFragmentResultListener(ARGS_FRAGMENT_REQUEST_KEY) { _: String, bundle: Bundle ->
            val resultNumber = bundle.getInt(ARGS_FRAGMENT_RESULT_NUMBER)
            if (resultNumber != 0) {
                Toast.makeText(requireContext(), "Result received - $resultNumber", Toast.LENGTH_SHORT).show()
            }
        }
    }
}