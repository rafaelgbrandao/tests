package br.com.gud.webrepository.infra

import retrofit2.Retrofit

object ServiceFactory {
    fun <T> createService(retrofit: Retrofit, clazz: Class<T>): T {
        return retrofit.create(clazz)
    }
}