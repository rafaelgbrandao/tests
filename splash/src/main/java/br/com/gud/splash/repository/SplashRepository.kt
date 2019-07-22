package br.com.gud.splash.repository

interface SplashRepository {

    fun onSearchForUpdateVersionNumber(): Int

    suspend fun onSearchForUpdates(): Boolean

    fun isUserValid(deviceId: String, appVersion: String): Boolean
}