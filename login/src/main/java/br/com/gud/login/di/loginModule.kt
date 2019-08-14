package br.com.gud.login.di

import br.com.gud.login.LoginViewModel
import org.koin.dsl.module

val loginModule = module {

    single { LoginViewModel() }
}