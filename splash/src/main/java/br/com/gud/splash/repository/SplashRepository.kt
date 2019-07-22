package br.com.gud.splash.repository

interface SplashRepository {

    fun onSearchForUpdateVersionNumber(): Int

    suspend fun onSearchForUpdates(): Boolean
}