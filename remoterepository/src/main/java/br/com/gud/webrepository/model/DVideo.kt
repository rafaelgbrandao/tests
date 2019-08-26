package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DVideo(
    @SerializedName("id_musica") val musicID: Int? = null,
    @SerializedName("link") val link: String? = null,
    @SerializedName("ativo") val active: Int = 0
)