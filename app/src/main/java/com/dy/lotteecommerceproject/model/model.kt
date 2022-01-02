package com.dy.lotteecommerceproject.model

import com.google.gson.annotations.SerializedName

data class SearchInfo(
    @SerializedName("TotalCount") val totalCount: Int,
    @SerializedName("Data") val data: List<SearchData>
)

data class SearchData(
    @SerializedName("Result") val result: List<SearchResult>
)

data class SearchResult(
    @SerializedName("movieSeq") val movieSeq: Int,
    @SerializedName("title") val title: String,
    @SerializedName("directors") val directors: Directors,
    @SerializedName("repRlsDate") val repRlsDate: String,
    @SerializedName("posters") val posters: String
)
data class Directors(
    @SerializedName("director") val director: List<Director>
)
data class Director(
    @SerializedName("directorNm") val directorNm: String
)





