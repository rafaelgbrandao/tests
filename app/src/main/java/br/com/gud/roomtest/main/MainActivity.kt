package br.com.gud.roomtest.main

import android.os.Bundle
import android.util.Log
import androidx.annotation.IdRes
import androidx.annotation.IntegerRes
import androidx.annotation.NavigationRes
import androidx.navigation.findNavController
import br.com.gud.core.base.BaseActivity
import br.com.gud.roomtest.R
import br.com.gud.core.extensions.observe
import br.com.gud.navigation.NavigationClassNames
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private val viewModel by viewModel<MainActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.navigationFromLogin().observe(this) { isValidUser ->
            when {
                isValidUser -> navigateToScreen(R.id.action_splashFragment_to_homeFragment)
                else -> navigateToScreen(R.id.action_splashFragment_to_loginFragment)
            }
        }
    }

    private fun navigateToScreen(@IdRes screen: Int) {
        findNavController(R.id.nav_host_fragment)
            .navigate(screen)
    }
}