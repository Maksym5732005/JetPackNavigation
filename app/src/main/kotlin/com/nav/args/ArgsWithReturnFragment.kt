package com.nav.args

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.nav.R
import com.nav.databinding.FragmentArgsWithReturnBinding
import kotlin.random.Random


class ArgsWithReturnFragment: Fragment(R.layout.fragment_args_with_return) {

    private lateinit var binding: FragmentArgsWithReturnBinding
    private val args: ArgsWithReturnFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArgsWithReturnBinding.bind(view)

        initListeners()
        handleArgs()
    }

    private fun initListeners() = with(binding) {
        btnBackWithArgs.setOnClickListener {
            val number = Random.nextInt(100)
            setFragmentResult(
                ARGS_FRAGMENT_REQUEST_KEY,
                bundleOf(ARGS_FRAGMENT_RESULT_NUMBER to number)
            )
            findNavController().popBackStack()
        }

        btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun handleArgs() {
        Log.i("Args", args.toString())
        var noArgsReceived: Boolean? = null
        if (args.intArg != 0) {
            noArgsReceived = false
            binding.textIntArgs.text = args.intArg.toString()
        }

        if (args.resArg != 0) {
            noArgsReceived = false
            binding.viewColorArgs.setBackgroundColor(args.resArg)
        }

        if (noArgsReceived == null) {
            Toast.makeText(requireContext(), "No arguments received", Toast.LENGTH_LONG).show()
        }
    }
}