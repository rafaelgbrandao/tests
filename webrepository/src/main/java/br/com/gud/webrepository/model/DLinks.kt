package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DLinks(
    @SerializedName("id") val linkId: Int? = null,
    @SerializedName("nome") val linkName: String? = null,
    @SerializedName("link") val url: String? = null,
    @SerializedName("ativo") val active: Int? = null
)