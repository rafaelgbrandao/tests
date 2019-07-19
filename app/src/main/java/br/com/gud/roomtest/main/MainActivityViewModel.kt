package br.com.gud.roomtest.main

import androidx.lifecycle.ViewModel
import br.com.gud.navigation.Navigation

class MainActivityViewModel(private val navigation: Navigation): ViewModel() {

    fun navigateToScreen() = navigation.navigateToScreen()
}