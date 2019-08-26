package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DServerError(
    @SerializedName("info") val info: Int,
    @SerializedName("mensagem") val message: String
)