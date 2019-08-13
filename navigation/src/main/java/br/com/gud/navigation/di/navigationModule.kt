package br.com.gud.navigation.di

import br.com.gud.navigation.Navigation
import org.koin.dsl.module

val navigationModule = module {

    single { Navigation() }
}