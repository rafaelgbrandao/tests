package br.com.gud.localrepository.update

import br.com.gud.webrepository.update.UpdateRemoteRepository

class LocalUpdateRepositoryImpl(private val webUpdateRemoteRepository: UpdateRemoteRepository): LocalUpdateRepository {

    override suspend fun getContentUpdate(): Boolean {
        return webUpdateRemoteRepository.getContentUpdate(getLastUpdateDate()).isNotEmpty()
    }

    private fun getLastUpdateDate(): String {
        return "2018-03-08 10:42:10"
    }
}