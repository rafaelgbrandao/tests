package br.com.gud.roomtest

import android.app.Application
import br.com.gud.localrepository.di.localRepositoryModule
import br.com.gud.login.di.loginModule
import br.com.gud.navigation.di.navigationModule
import br.com.gud.roomtest.di.appModule
import br.com.gud.splash.di.splashModule
import br.com.gud.webrepository.di.webRepositoryModule
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    loginModule,
                    splashModule,
                    navigationModule,
                    localRepositoryModule,
                    webRepositoryModule,
                    appModule
                )
            )
        }
    }
}