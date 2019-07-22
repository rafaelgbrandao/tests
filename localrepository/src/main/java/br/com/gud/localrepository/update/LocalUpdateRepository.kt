package br.com.gud.localrepository.update

interface LocalUpdateRepository {

    suspend fun getContentUpdate(): Boolean
}