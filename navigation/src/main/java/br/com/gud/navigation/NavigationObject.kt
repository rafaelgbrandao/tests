package br.com.gud.navigation

data class NavigationObject(
    val screen: NavigationClassNames,
    val extras: Map<Any, Any> = mapOf()
)