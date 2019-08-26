package br.com.gud.webrepository.user

import br.com.gud.webrepository.model.DDefaultBody
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

interface UserRemoteSource {

    @POST("Louvemos_cifrado/scripts/wb.php")
    fun isValidUser(@Body userRequestObject: UserRequestObject): Deferred<DDefaultBody>
}