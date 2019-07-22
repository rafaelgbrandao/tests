package br.com.gud.webrepository.update

import br.com.gud.core.models.ChordsModel
import com.google.gson.annotations.SerializedName

data class WebUpdateResponseObject(
    @SerializedName("Acordes") val chordsList: List<ChordsModel>
)