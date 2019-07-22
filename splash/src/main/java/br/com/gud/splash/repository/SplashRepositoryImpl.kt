package br.com.gud.splash.repository

import br.com.gud.localrepository.update.LocalUpdateRepository
import kotlinx.coroutines.runBlocking

class SplashRepositoryImpl(private val localRemoteSource: LocalUpdateRepository): SplashRepository {

    override fun onSearchForUpdateVersionNumber(): Int {
        return 15
    }

    override fun onSearchForUpdates(): Boolean {
        return runBlocking { localRemoteSource.getContentUpdate() }
    }
}