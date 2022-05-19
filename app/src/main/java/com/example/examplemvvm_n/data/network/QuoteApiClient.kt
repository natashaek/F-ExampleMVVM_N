package com.example.examplemvvm_n.data.model.network

import com.example.examplemvvm_n.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>

}