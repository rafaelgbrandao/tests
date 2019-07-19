package br.com.gud.navigation

interface NavigationInterface {

    fun navigateToFragment(screen: NavigationClassNames, extras: Map<Any, Any> = mapOf())
}