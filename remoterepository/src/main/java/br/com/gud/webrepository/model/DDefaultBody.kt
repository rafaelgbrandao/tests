package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DDefaultBody(
    @SerializedName("val") val id: Int,
    @SerializedName("mensagem") val message: String
)