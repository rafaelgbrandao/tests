package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DCategory(
    @SerializedName("_id") val categoryID: Int? = null,
    @SerializedName("nome") val categoryName: String? = null,
    @SerializedName("ordem") val order: Int = 0,
    @SerializedName("ativo") val active: Int = 0
)