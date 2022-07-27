package com.masorone.testtaskscid.domain

import com.masorone.testtaskscid.data.DataPagingSource

interface DataRepository {

    fun fetchDataList(): DataPagingSource
}