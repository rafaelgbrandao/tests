package br.com.gud.splash.repository

class SplashRepositoryImpl: SplashRepository {

    override fun onSearchForUpdateVersionNumber(): Int {
        return -1
    }

    override fun onSearchForUpdates(): Boolean {
        return false
    }
}