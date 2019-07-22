package br.com.gud.splash.repository

import br.com.gud.localrepository.update.LocalUpdateRepository

class SplashRepositoryImpl(private val localRemoteSource: LocalUpdateRepository): SplashRepository {

    override fun onSearchForUpdateVersionNumber(): Int {
        return 15
    }

    override suspend fun onSearchForUpdates(): Boolean {
        return localRemoteSource.getContentUpdate()
    }
}