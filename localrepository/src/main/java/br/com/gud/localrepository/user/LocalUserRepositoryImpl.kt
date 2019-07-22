package br.com.gud.localrepository.user

import br.com.gud.webrepository.user.WebUserRepository

class LocalUserRepositoryImpl(private val webUserRepository: WebUserRepository): LocalUserRepository {

    override fun isUserValid(appVersion: String, deviceId: String): Boolean {
        return webUserRepository.isValidUser(
            appVersion = appVersion,
            deviceId = deviceId,
            userKey = "12wer",
            email = "rafael.brandao@rs21.com.br"
        )
    }
}