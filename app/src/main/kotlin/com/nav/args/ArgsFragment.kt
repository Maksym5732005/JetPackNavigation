package com.nav.args

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nav.R
import com.nav.databinding.FragmentArgsBinding


class ArgsFragment: Fragment(R.layout.fragment_args) {

    companion object {
        const val RESULT_NUMBER = "RESULT_NUMBER"
    }

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
        val numberLiveData = findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<Int>(RESULT_NUMBER)
        numberLiveData?.observe(viewLifecycleOwner) { result ->
            result ?: return@observe
            Toast.makeText(requireContext(), "$result", Toast.LENGTH_SHORT).show()
            numberLiveData.value = null // set null or you will get result again.
        }
    }
}