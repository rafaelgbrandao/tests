package br.com.gud.webrepository.di

import br.com.gud.webrepository.update.UpdateRemoteSource
import br.com.gud.webrepository.infra.ServiceFactory
import br.com.gud.webrepository.update.UpdateRemoteRepository
import br.com.gud.webrepository.update.UpdateRemoteRepositoryImpl
import br.com.gud.webrepository.user.UserRemoteSource
import br.com.gud.webrepository.user.UserRemoteRepository
import br.com.gud.webrepository.user.UserRemoteRepositoryImpl
import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URL
import java.util.concurrent.TimeUnit

const val RETROFIT_UPDATE = "Retrofit"
const val HTTP_TIMEOUT_SECONDS = 30L

val webRepositoryModule = module {

    factory { Gson() }

    single { GsonConverterFactory.create(get()) }

    single {
        OkHttpClient.Builder()
            .addNetworkInterceptor(get<HttpLoggingInterceptor>())
            .readTimeout(HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .connectTimeout(HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .build()
    }

    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    single(named(RETROFIT_UPDATE)) {
        Retrofit
            .Builder()
            .baseUrl(URL("http://www.brasilcristao.com.br/app/"))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(get<GsonConverterFactory>())
            .client(get<OkHttpClient>())
            .build()
    }

    factory { ServiceFactory.createService(
        get(named(RETROFIT_UPDATE)),
        UpdateRemoteSource::class.java)
    }

    factory { ServiceFactory.createService(
        get(named(RETROFIT_UPDATE)),
        UserRemoteSource::class.java)
    }

    single<UpdateRemoteRepository> { UpdateRemoteRepositoryImpl(get()) }

    single<UserRemoteRepository> { UserRemoteRepositoryImpl(get()) }
}