package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DMusicTips(
    @SerializedName("_id") val tipId: Int? = null,
    @SerializedName("titulo") val tipTitle: String? = null,
    @SerializedName("dica") val tipText: String? = null,
    @SerializedName("dia") val day: String? = null,
    @SerializedName("ativo") val active: Int? = null
)