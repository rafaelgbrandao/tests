package br.com.gud.splash.repository

interface SplashRepository {

    fun onSearchForUpdateVersionNumber(): Int

    fun onSearchForUpdates(): Boolean
}