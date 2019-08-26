package br.com.gud.webrepository.user

import com.google.gson.annotations.SerializedName

data class UserRequestObject(
    @SerializedName("chave") val userKey: String,
    @SerializedName("email") val email: String,
    @SerializedName("geral") val param: String,
    @SerializedName("id_aparelho") val deviceId: String,
    @SerializedName("versao") val appVersion: String,
    @SerializedName("versao_os") val osVersion: String,
    @SerializedName("nova_versao") val newVersion: Int = 1
)