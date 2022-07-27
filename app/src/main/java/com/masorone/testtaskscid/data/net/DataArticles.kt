package com.masorone.testtaskscid.data.net

import com.google.gson.annotations.SerializedName

data class DataArticles(
    @SerializedName("success") var success: Boolean,
    @SerializedName("result") var result: DataResult
)