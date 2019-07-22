package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

data class DChords(
    @SerializedName("_id") val id: Int? = null,
    @SerializedName("flag_teclado") val keyboardFlag: Int? = null,
    @SerializedName("flag_violao") val guitarFlag: Int? = null,
    @SerializedName("acorde") val chord: String? = null,
    @SerializedName("sequencia_teclado") val keyboardSequence: String? = null,
    @SerializedName("sequencia_violao") val guitarSequence: String? = null
)