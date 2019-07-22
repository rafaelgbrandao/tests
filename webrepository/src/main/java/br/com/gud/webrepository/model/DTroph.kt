package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DTroph(
    @SerializedName("id_musica") val musicID: Int? = null,
    @SerializedName("trofeu") val troph: Int? = null,
    @SerializedName("texto") val text: String? = null,
    @SerializedName("ativo") val active: Int = 0
)