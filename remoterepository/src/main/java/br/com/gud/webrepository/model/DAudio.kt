package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DAudio(
    @SerializedName("_id") val id: Int? = null,
    @SerializedName("id_musica") val musicId: Int? = null,
    @SerializedName("duracao") val duration: Int? = null,
    @SerializedName("ativo") val active: Int = 0
)