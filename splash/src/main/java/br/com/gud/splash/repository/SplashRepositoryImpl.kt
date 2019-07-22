package br.com.gud.splash.repository

import br.com.gud.localrepository.update.LocalUpdateRepository
import br.com.gud.localrepository.user.LocalUserRepository

class SplashRepositoryImpl(
    private val updateRemoteSource: LocalUpdateRepository,
    private val userLocalRemoteSource: LocalUserRepository
): SplashRepository {

    override fun isUserValid(deviceId: String, appVersion: String): Boolean {
        return userLocalRemoteSource.isUserValid(
            deviceId = deviceId,
            appVersion = appVersion
        )
    }

    override fun onSearchForUpdateVersionNumber(): Int {
        return 15
    }

    override suspend fun onSearchForUpdates(): Boolean {
        return updateRemoteSource.getContentUpdate()
    }
}