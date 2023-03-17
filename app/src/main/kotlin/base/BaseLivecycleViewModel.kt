package base

import android.util.Log
import androidx.lifecycle.ViewModel

open class BaseLivecycleViewModel: ViewModel() {
    init {
        logLifecycle("[Init]")
    }

    fun check() {
        logLifecycle("check")
    }

    override fun onCleared() {
        logLifecycle("[onCleared]")
        super.onCleared()
    }

    private fun logLifecycle(msg: String) {
        Log.d(this.javaClass.simpleName, msg + " // ${hashCode()}")
    }
}