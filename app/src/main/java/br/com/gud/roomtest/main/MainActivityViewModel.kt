package br.com.gud.roomtest.main

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import br.com.gud.navigation.Navigation

class MainActivityViewModel(private val navigation: Navigation): ViewModel() {

    fun navigationFromLogin() = navigation.lvSelectedScreen

    fun initNavigation(lifecycleOwner: LifecycleOwner) {
        navigation.initObservers(lifecycleOwner)
    }
}