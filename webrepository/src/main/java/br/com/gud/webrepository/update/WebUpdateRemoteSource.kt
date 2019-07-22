package br.com.gud.webrepository.update

import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

interface WebUpdateRemoteSource {

    @POST("Louvemos_cifrado/scripts/app_atualizacao.php")
    fun getContentUpdate(
        @Body webUpdateRequestObject: WebUpdateRequestObject
    ): Deferred<List<WebUpdateResponseObject>>
}