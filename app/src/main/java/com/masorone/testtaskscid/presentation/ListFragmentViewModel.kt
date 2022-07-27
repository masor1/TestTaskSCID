package com.masorone.testtaskscid.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import androidx.paging.liveData
import com.masorone.testtaskscid.domain.DataRepository

class ListFragmentViewModel(
    repository: DataRepository
) : ViewModel() {

    val data = Pager(
        config = PagingConfig(pageSize = 10, enablePlaceholders = false),
        pagingSourceFactory = { repository.fetchDataList() }
    )
        .liveData
        .cachedIn(viewModelScope)
}