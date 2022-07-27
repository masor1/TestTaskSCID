package com.masorone.testtaskscid.data

import com.masorone.testtaskscid.data.net.DataApiService

interface CloudDataSource {

    suspend fun fetchData(page: Int): List<DataItemData>

    class Base(private val retrofit: DataApiService) : CloudDataSource {

        override suspend fun fetchData(page: Int): List<DataItemData> {
            return retrofit.fetchDataList(page).result.data.map { item ->
                item.mapToItemData()
            }
        }
    }
}