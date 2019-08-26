package br.com.gud.navigation

import androidx.annotation.IdRes

data class RouterObject(
    @IdRes val screen: Int,
    val extras: Pair<String, Any>?
)