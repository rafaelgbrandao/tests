package br.com.gud.roomtest.main

import android.os.Bundle
import android.util.Log
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

        viewModel.navigateToScreen().observe(this) { navObject ->
            when (navObject.screen){
                NavigationClassNames.FRAGMENT_HOME -> {
                    findNavController(R.id.nav_host_fragment)
                        .navigate(R.id.action_splashFragment_to_homeFragment)
                }
                NavigationClassNames.FRAGMENT_LOGIN -> {
                    findNavController(R.id.nav_host_fragment)
                        .navigate(R.id.action_splashFragment_to_loginFragment)
                }
                else -> {
                    Log.v("Teste", "Ops...nenhuma tela selecionada")
                }
            }
        }
    }
}