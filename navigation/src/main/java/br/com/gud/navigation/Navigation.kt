package br.com.gud.navigation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object Navigation: NavigationInterface {

    fun navigateToScreen(): LiveData<NavigationObject> = selectedScreen
    private val selectedScreen = MutableLiveData<NavigationObject>()

    override fun navigateToFragment(screen: NavigationClassNames, extras: Map<Any, Any>) {
        selectedScreen.postValue(NavigationObject(screen = screen, extras = extras))
    }
}