package br.com.gud.localrepository.user

import br.com.gud.webrepository.user.UserRemoteRepository

class LocalUserRepositoryImpl(private val userRemoteRepository: UserRemoteRepository): LocalUserRepository {

    override fun isUserValid(appVersion: String, deviceId: String): Boolean {
        return userRemoteRepository.isValidUser(
            appVersion = appVersion,
            deviceId = deviceId,
            userKey = "12wer",
            email = "rafael.brandao@rs21.com.br"
        )
    }
}