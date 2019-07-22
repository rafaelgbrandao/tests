package br.com.gud.localrepository.user

interface LocalUserRepository {

    fun isUserValid(appVersion: String, deviceId: String): Boolean
}