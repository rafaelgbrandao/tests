package br.com.gud.roomtest.main

import androidx.lifecycle.ViewModel
import br.com.gud.navigation.Navigation
import br.com.gud.splash.presentation.SplashViewModel

class MainActivityViewModel(
    private val splashViewModel: SplashViewModel
): ViewModel() {

    fun navigationFromLogin() = splashViewModel.isUserValid()
}