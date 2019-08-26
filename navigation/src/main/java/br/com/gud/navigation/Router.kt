package br.com.gud.navigation

import androidx.lifecycle.MutableLiveData

class Router {

    companion object {
        private val TAG = Router::class.java.name
    }

    val lvSelectedScreen = MutableLiveData<RouterObject>()

    fun navigateToScreen(screenID: RoutersIds, extras: Any? = null) {
        lvSelectedScreen.postValue(
            RouterObject(
                screen = screenID.screenId,
                extras = getExtrasByScreenId(screenID, extras)
            )
        )
    }

    private fun getExtrasByScreenId(screenID: RoutersIds, extras: Any?): Pair<String, Any>? {
        return extras?.let {
            when (screenID) {
                RoutersIds.IS_USER_VALID -> buildExtrasForSplashToHome(it)
                else -> null
            }
        }
    }

    private fun buildExtrasForSplashToHome(extras: Any): Pair<String, Any>? {
        return if (extras is Boolean) {
            Pair("Teste", if (extras) "Existe" else "Valida")
        } else {
            null
        }
    }
}