package com.masorone.testtaskscid.data.net

import com.google.gson.annotations.SerializedName
import com.masorone.testtaskscid.data.DataItemData

data class DataItemNet(
    @SerializedName("id") private val id: Int,
    @SerializedName("name") private val name: String,
    @SerializedName("description") private val description: String,
    @SerializedName("date") private val date: String
) {
    fun mapToItemData() = DataItemData(
        id,
        name,
        description,
        date
    )
}