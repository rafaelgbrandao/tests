package br.com.gud.roomtest

import android.app.Application
import br.com.gud.navigation.navigationModule
import br.com.gud.roomtest.di.appModule
import br.com.gud.splash.di.splashModule
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    splashModule,
                    navigationModule,
                    appModule
                )
            )
        }
    }
}