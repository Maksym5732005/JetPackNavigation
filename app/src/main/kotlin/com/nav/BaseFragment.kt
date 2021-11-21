package com.nav

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes contentLayoutId: Int) : Fragment(contentLayoutId) {

    @Suppress("PrivatePropertyName") private val TAG = this.javaClass.simpleName

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "onAttach // ${hashCode()}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate // ${hashCode()}")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated // ${hashCode()}")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart // ${hashCode()}")
    }

    override fun onResume() {
        Log.i(TAG, "onResume // ${hashCode()}")
        super.onResume()
    }

    //----------------------------------------------------------------------------------------------------------------//
    //----------------------------------------------------------------------------------------------------------------//
    //----------------------------------------------------------------------------------------------------------------//

    override fun onPause() {
        Log.i(TAG, "onPause // ${hashCode()}")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "onStop // ${hashCode()}")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i(TAG, "onDestroyView // ${hashCode()}")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy // ${hashCode()}")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(TAG, "onDetach // ${hashCode()}")
        super.onDetach()
    }
}