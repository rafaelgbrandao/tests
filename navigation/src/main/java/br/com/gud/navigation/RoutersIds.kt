package br.com.gud.navigation

import androidx.annotation.IdRes

enum class RoutersIds(@IdRes internal val screenId: Int) {

    IS_USER_VALID(R.id.action_splashFragment_to_homeFragment),
    IS_USER_INVALID(R.id.action_splashFragment_to_loginFragment)
}