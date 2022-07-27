package com.masorone.testtaskscid.data

import androidx.paging.PagingSource
import androidx.paging.PagingState

class DataPagingSource(
    private val cloudDataSource: CloudDataSource
) : PagingSource<Int, DataItemData>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DataItemData> {
        val page = params.key ?: 1
        return try {
            val data = cloudDataSource.fetchData(page)
            LoadResult.Page(
                data,
                prevKey = if (page == 1) null else page - 1,
                nextKey = page + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, DataItemData>): Int {
        return state.anchorPosition ?: return 1
    }
}