package br.com.gud.localrepository.update

import br.com.gud.webrepository.update.WebUpdateRepository

class LocalUpdateRepositoryImpl(private val webWebUpdateRepository: WebUpdateRepository): LocalUpdateRepository {

    override suspend fun getContentUpdate(): Boolean {
        return webWebUpdateRepository.getContentUpdate(getLastUpdateDate()).isNotEmpty()
    }

    private fun getLastUpdateDate(): String {
        return "2018-03-08 10:42:10"
    }
}