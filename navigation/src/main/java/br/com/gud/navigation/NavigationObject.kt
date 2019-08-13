package br.com.gud.navigation

import androidx.annotation.IdRes

data class NavigationObject(
    @IdRes val screen: Int,
    val extras: Map<Any, Any> = mapOf()
)