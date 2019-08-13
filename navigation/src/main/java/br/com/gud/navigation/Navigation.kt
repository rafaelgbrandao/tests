package br.com.gud.navigation

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import br.com.gud.core.base.BaseNavigation
import br.com.gud.core.extensions.observe
import br.com.gud.splash.presentation.SplashFragment

class Navigation {

    val lvSelectedScreen = MutableLiveData<NavigationObject>()

    fun initObservers(lifecycleOwner: LifecycleOwner) {
        BaseNavigation.nextFlow().observe(lifecycleOwner) { (screen, any) ->
            when (screen) {
                SplashFragment().javaClass.name -> navigateFromSplashScreen(any as Boolean)
            }
        }
    }

    private fun navigateFromSplashScreen(isUserLogged: Boolean) {
        lvSelectedScreen.postValue(
            when {
                isUserLogged -> NavigationObject(screen = R.id.action_splashFragment_to_homeFragment)
                else -> NavigationObject(screen = R.id.action_splashFragment_to_loginFragment)
            }
        )
    }
}