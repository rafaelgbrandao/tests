package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DComposer(
    @SerializedName("_id") val categoryId: Int? = null,
    @SerializedName("nome") val categories: String? = null,
    @SerializedName("pesquisa") val search: String? = null,
    @SerializedName("ativo") val active: Int = 0
)