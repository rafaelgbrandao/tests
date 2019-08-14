package br.com.gud.navigation

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import br.com.gud.core.base.BaseNavigation
import br.com.gud.core.extensions.observe
import br.com.gud.login.LoginFragment
import br.com.gud.splash.presentation.SplashFragment

class Navigation {

    companion object {
        private val TAG = Navigation::class.java.name
    }

    val lvSelectedScreen = MutableLiveData<NavigationObject>()

    fun initObservers(lifecycleOwner: LifecycleOwner) {
        BaseNavigation.nextFlow().observe(lifecycleOwner) { (screen, any) ->
            when (screen) {
                SplashFragment().javaClass.name -> navigateFromSplashScreen(any)
                LoginFragment().javaClass.name -> navigateFromLoginScreen()
            }
        }
    }

    private fun navigateFromSplashScreen(extras: Any?) {
        if (extras != null && extras is Boolean) {
            lvSelectedScreen.postValue(
                when {
                    extras -> NavigationObject(screen = R.id.action_splashFragment_to_homeFragment)
                    else -> NavigationObject(screen = R.id.action_splashFragment_to_loginFragment)
                }
            )
        } else {
            Log.v(TAG,"Wrong extras...")
        }
    }

    private fun navigateFromLoginScreen() {
        lvSelectedScreen.postValue(
            NavigationObject(screen = R.id.action_loginFragment_to_homeFragment)
        )
    }
}