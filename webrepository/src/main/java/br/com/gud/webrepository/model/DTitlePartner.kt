package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DTitlePartner(
    @SerializedName("id_titulo") val id: Int? = null,
    @SerializedName("nome") val title: String? = null,
    @SerializedName("flag") val flag: Int = 0,
    @SerializedName("ativo") val active: Int = 0
)