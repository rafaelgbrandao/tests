package br.com.gud.webrepository.user

import br.com.gud.webrepository.model.DDefaultBody
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

interface WebUserRemoteSource {

    @POST("Louvemos_cifrado/scripts/wb.php")
    fun isValidUser(@Body webUserRequestObject: WebUserRequestObject): Deferred<DDefaultBody>
}