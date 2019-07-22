package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DMusic(
    @SerializedName("id_musica") val musicId: Int = 0,
    @SerializedName("ativo") val active: Int = 0,
    @SerializedName("autor") val composer: String? = null,
    @SerializedName("categoria") val category: String? = null,
    @SerializedName("cd") val cd: String? = null,
    @SerializedName("favorito") val favored: Int = 0,
    @SerializedName("nome") val music: String? = null,
    @SerializedName("ordem") val order: Int = 0,
    @SerializedName("tom") val tone: Int = 0,
    @SerializedName("estrofe") val vesus: String = "",
    @SerializedName("refrao") val chorus: String = "",
    @SerializedName("montagem_normal") val normalAssemble: String = "",
    @SerializedName("montagem_repeticao") val repeatableAssemble: String = "",
    @SerializedName("sequencia_estrofe") val versusSequence: String = "",
    @SerializedName("sequencia_refrao") val chorusSequence: String = ""
)