package br.com.gud.webrepository.update

import android.util.Log

class WebUpdateRepositoryImpl(private val webUpdateRemoteSource: WebUpdateRemoteSource): WebUpdateRepository {

    override suspend fun getContentUpdate(lastUpdateDate: String): List<String> {
        val result = webUpdateRemoteSource.getContentUpdate(
            WebUpdateRequestObject(
                restaurar = "atualizacao",
                plataforma = "android",
                data_att = lastUpdateDate
            )
        ).await()
        result.forEach {
            Log.v("Teste", "Chords - ${it.chordsList.size}")
        }
        return emptyList()
    }
}