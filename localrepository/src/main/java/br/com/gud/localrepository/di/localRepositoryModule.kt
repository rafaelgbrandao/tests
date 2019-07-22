package br.com.gud.localrepository.di

import br.com.gud.localrepository.update.LocalUpdateRepository
import br.com.gud.localrepository.update.LocalUpdateRepositoryImpl
import br.com.gud.webrepository.update.WebUpdateRepository
import br.com.gud.webrepository.update.WebUpdateRepositoryImpl
import org.koin.dsl.module

val localRepositoryModule = module {

    single<LocalUpdateRepository> { LocalUpdateRepositoryImpl(get()) }
}