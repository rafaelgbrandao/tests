package br.com.gud.webrepository.update

import com.google.gson.annotations.SerializedName

data class WebUpdateRequestObject(
    @SerializedName("restaurar") val param: String,
    @SerializedName("plataforma") val plataform: String,
    @SerializedName("data_att") val lastUpdateRequested: String
)