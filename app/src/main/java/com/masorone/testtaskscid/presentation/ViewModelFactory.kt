package com.masorone.testtaskscid.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.masorone.testtaskscid.domain.DataRepository

class ViewModelFactory(
    private val repository: DataRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ListFragmentViewModel(repository) as T
    }
}