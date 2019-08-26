package br.com.gud.webrepository.update

import android.util.Log
import br.com.gud.webrepository.model.DServerError
import retrofit2.HttpException

class UpdateRemoteRepositoryImpl(private val updateRemoteSource: UpdateRemoteSource): UpdateRemoteRepository {

    override suspend fun getContentUpdate(lastUpdateDate: String): List<String> {
        try {
            val result = updateRemoteSource.getContentUpdate(
                UpdateRequestObject(
                    param = "atualizacao",
                    plataform = "android",
                    lastUpdateRequested = lastUpdateDate
                )
            ).await()
            when (result) {
                is DServerError -> Log.v("Teste", "Chords - ${result.message}")
                is UpdateResponseObject -> {
                    Log.v("Teste", "Chords - ${result.audioList.size}")
                }
                else -> Log.v("Teste", "Nenhuma opção")
            }
        } catch (error: HttpException) {
            Log.v("Teste", "Erro de requisição")
        }

        return emptyList()
    }
}