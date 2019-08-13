package br.com.gud.core.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object BaseNavigation {

    fun nextFlow(): LiveData<Pair<String, Any>> = lvNextFlow
    val lvNextFlow = MutableLiveData<Pair<String, Any>>()
}