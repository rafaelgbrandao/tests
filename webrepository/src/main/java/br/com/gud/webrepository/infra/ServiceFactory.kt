package br.com.gud.webrepository.infra

import retrofit2.Retrofit

object ServiceFactory {
    inline fun <reified T> createService(retrofit: Retrofit): T {
        return retrofit.create(T::class.java)
    }
}