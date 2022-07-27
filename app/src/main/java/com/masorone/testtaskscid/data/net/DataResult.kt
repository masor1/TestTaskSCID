package com.masorone.testtaskscid.data.net

import com.google.gson.annotations.SerializedName

data class DataResult(
    @SerializedName("current_page") var currentPage: Int,
    @SerializedName("data") var data: ArrayList<DataItemNet>
)