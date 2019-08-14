package br.com.gud.core.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.gud.core.models.NavigationObject

object BaseNavigation {

    fun nextFlow(): LiveData<NavigationObject> = lvNextFlow
    val lvNextFlow = MutableLiveData<NavigationObject>()
}