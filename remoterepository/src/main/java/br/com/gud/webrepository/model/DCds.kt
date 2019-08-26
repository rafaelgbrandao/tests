package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DCds(
    @SerializedName("_id") val cdID: Int? = null,
    @SerializedName("nome") val cdName: String? = null,
    @SerializedName("link") val cdLink: String? = null,
    @SerializedName("ativo") val active: Int = 0
)