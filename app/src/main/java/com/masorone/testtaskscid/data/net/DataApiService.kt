package com.masorone.testtaskscid.data.net

import retrofit2.http.GET
import retrofit2.http.Query

interface DataApiService {

    @GET("api/books")
    suspend fun fetchDataList(
        @Query("page") page: Int = 1
    ): DataArticles
}