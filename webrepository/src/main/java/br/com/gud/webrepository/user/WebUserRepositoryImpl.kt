package br.com.gud.webrepository.user

import android.os.Build
import kotlinx.coroutines.runBlocking

class WebUserRepositoryImpl(private val userRemoteSource: WebUserRemoteSource): WebUserRepository {

    override fun isValidUser(
        appVersion: String,
        deviceId: String,
        email: String,
        userKey: String
    ): Boolean {
        runBlocking {
            val user = userRemoteSource.isValidUser(
                WebUserRequestObject(
                    userKey = userKey,
                    email = email,
                    param = "valida_usuario",
                    deviceId = deviceId,
                    appVersion = appVersion,
                    osVersion = Build.VERSION.RELEASE
                )
            ).await()
        }

        return false
    }
}