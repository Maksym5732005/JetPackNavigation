package com.nav

import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment


fun Fragment.addOnBackPressedCallback(
    enabled: Boolean = true,
    onBackPressed: OnBackPressedCallback.() -> Unit,
): OnBackPressedCallback {
    return object : OnBackPressedCallback(enabled) {
        override fun handleOnBackPressed(): Unit = onBackPressed()

    }.also { requireActivity().onBackPressedDispatcher.addCallback(this, it) }
}