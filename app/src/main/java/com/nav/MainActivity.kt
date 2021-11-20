package com.nav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) setHomeScreen(R.id.oauth_navigation)
    }

    private fun setHomeScreen(destination: Int) {
        val navController = findNavController()
        val graph = navController.graph
        graph.startDestination = destination
        navController.graph = graph
    }


    private fun findNavController(): NavController {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.main_container)
        return requireNotNull(navHostFragment).findNavController()
    }
}