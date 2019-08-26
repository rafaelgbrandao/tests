package br.com.gud.webrepository.update

import br.com.gud.webrepository.model.*
import com.google.gson.annotations.SerializedName

data class UpdateResponseObject(
    @SerializedName("info") val error: List<DServerError>,
    @SerializedName("Acordes") val chordsList: List<DChords>,
    @SerializedName("Audios") val audioList: List<DAudio>,
    @SerializedName("Dicas_musico") val musicTipList: List<DMusicTips>,
    @SerializedName("Trofeu") val trophList: List<DTroph>,
    @SerializedName("Links") val linkList: List<DLinks>,
    @SerializedName("Cds") val cdList: List<DCds>,
    @SerializedName("Musicas_louvemos") val musicList: List<DMusic>,
    @SerializedName("Categorias") val categoryList: List<DCategory>,
    @SerializedName("Subcategorias") val subcategoryList: List<DSubcategory>,
    @SerializedName("Artistas") val composerList: List<DComposer>,
    @SerializedName("Videos") val videoList: List<DVideo>,
    @SerializedName("Titulo_parceiros") val partnerList: List<DTitlePartner>
)