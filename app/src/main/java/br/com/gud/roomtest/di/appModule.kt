package br.com.gud.roomtest.di

import br.com.gud.roomtest.main.MainActivityViewModel
import org.koin.dsl.module

val appModule = module {

    single { MainActivityViewModel(get()) }

}