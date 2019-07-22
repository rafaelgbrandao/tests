package br.com.gud.webrepository.user

interface WebUserRepository {

    fun isValidUser(appVersion: String, deviceId: String, email: String, userKey: String): Boolean
}