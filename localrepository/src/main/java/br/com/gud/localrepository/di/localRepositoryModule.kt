package br.com.gud.localrepository.di

import br.com.gud.localrepository.update.LocalUpdateRepository
import br.com.gud.localrepository.update.LocalUpdateRepositoryImpl
import br.com.gud.localrepository.user.LocalUserRepository
import br.com.gud.localrepository.user.LocalUserRepositoryImpl
import org.koin.dsl.module

val localRepositoryModule = module {

    single<LocalUpdateRepository> { LocalUpdateRepositoryImpl(get()) }

    single<LocalUserRepository> { LocalUserRepositoryImpl(get()) }
}