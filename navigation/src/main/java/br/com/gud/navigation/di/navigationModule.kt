package br.com.gud.navigation.di

import br.com.gud.navigation.Router
import org.koin.dsl.module

val navigationModule = module {

    single { Router() }
}