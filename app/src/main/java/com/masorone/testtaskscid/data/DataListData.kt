package com.masorone.testtaskscid.data

sealed class DataListData {

    class Success(list: List<DataItemData>) : DataListData()

    class Error(e: Exception) : DataListData()
}