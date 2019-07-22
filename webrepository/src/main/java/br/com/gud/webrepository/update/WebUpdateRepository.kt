package br.com.gud.webrepository.update

interface WebUpdateRepository {

    suspend fun getContentUpdate(lastUpdateDate: String): List<String>
}