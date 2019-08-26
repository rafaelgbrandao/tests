package br.com.gud.webrepository.model

import com.google.gson.annotations.SerializedName

class DSubcategory(
    @SerializedName("_id") val subcategoryID: Int? = 0,
    @SerializedName("id_categoria") val categoryID: Int = 0,
    @SerializedName("nome") val subcategoryName: String? = null,
    @SerializedName("ordem") val order: Int? = 0,
    @SerializedName("ativo") val active: Int? = 0,
    @SerializedName("abreviacao") val abbreviation: String = ""
)