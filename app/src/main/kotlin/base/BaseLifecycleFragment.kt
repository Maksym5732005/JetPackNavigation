package base

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseLifecycleFragment(layoutResId: Int) : Fragment(layoutResId) {
    override fun onAttach(context: Context) {
        logLifecycle("[onAttach]")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        logLifecycle("[onCreate]")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        logLifecycle("[onCreateView]")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        logLifecycle("[onStart]")
        super.onStart()
    }

    override fun onResume() {
        logLifecycle("[onResume]")
        super.onResume()
    }

    override fun onPause() {
        logLifecycle("[onPause]")
        super.onPause()
    }

    override fun onStop() {
        logLifecycle("[onStop]")
        super.onStop()
    }

    override fun onDestroyView() {
        logLifecycle("[onDestroyView]")
        super.onDestroyView()
    }

    override fun onDestroy() {
        logLifecycle("[onDestroy]")
        super.onDestroy()
    }

    override fun onDetach() {
        logLifecycle("[onDetach]")
        super.onDetach()
    }

    private fun logLifecycle(msg: String) {
        Log.d(this.javaClass.simpleName, msg + " // ${hashCode()}")
    }
}