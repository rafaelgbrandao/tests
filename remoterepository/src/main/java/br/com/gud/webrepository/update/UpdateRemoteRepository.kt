package br.com.gud.webrepository.update

interface UpdateRemoteRepository {

    suspend fun getContentUpdate(lastUpdateDate: String): List<String>
}