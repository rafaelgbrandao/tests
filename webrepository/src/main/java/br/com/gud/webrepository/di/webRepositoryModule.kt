package br.com.gud.webrepository.di

import android.net.Uri
import br.com.gud.webrepository.infra.ServiceFactory
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URL
import java.util.concurrent.TimeUnit

const val RETROFIT_UPDATE = "Update"
const val HTTP_TIMEOUT_SECONDS = "Connection Timeout"

val webRepositoryModule = module {

    factory { Gson() }

    single { GsonConverterFactory.create(get()) }

    single {
        OkHttpClient.Builder()
            .addNetworkInterceptor(get<HttpLoggingInterceptor>())
            .readTimeout(30L, TimeUnit.SECONDS)
            .writeTimeout(30L, TimeUnit.SECONDS)
            .connectTimeout(30L, TimeUnit.SECONDS)
            .build()
    }

    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    single {
        Retrofit
            .Builder()
            .baseUrl(URL(""))
            .addConverterFactory(get<GsonConverterFactory>())
            .client(get<OkHttpClient>())
            .build()
    }

    factory { ServiceFactory.createService(get<RETROFIT_UPDATE>()) }
}