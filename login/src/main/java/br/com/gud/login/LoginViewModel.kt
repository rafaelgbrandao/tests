package br.com.gud.login

import androidx.lifecycle.ViewModel
import br.com.gud.core.base.BaseNavigation
import br.com.gud.core.models.NavigationObject

class LoginViewModel: ViewModel() {

    fun nextScreen(screenName: String) {
        BaseNavigation.lvNextFlow.postValue(
            NavigationObject(screen = screenName)
        )
    }
}