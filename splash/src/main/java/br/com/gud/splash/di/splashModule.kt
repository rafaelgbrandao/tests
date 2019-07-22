package br.com.gud.splash.di

import br.com.gud.splash.presentation.SplashViewModel
import br.com.gud.splash.repository.SplashRepository
import br.com.gud.splash.repository.SplashRepositoryImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {

    viewModel { SplashViewModel(get()) }

    single<SplashRepository> { SplashRepositoryImpl(get(), get()) }
}