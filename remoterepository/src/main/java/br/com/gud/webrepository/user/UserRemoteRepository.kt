package br.com.gud.webrepository.user

interface UserRemoteRepository {

    fun isValidUser(appVersion: String, deviceId: String, email: String, userKey: String): Boolean
}