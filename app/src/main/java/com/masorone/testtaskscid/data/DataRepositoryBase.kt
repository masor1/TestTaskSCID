package com.masorone.testtaskscid.data

import com.masorone.testtaskscid.domain.DataRepository

class DataRepositoryBase(
    private val cloudDataSource: CloudDataSource
) : DataRepository {

    override fun fetchDataList(): DataPagingSource {
        return DataPagingSource(cloudDataSource)
    }
}