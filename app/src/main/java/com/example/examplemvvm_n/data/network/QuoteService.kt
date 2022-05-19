package com.example.examplemvvm_n.data.model.network

import com.example.examplemvvm_n.core.RetrofitHelper
import com.example.examplemvvm_n.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class QuoteService @Inject constructor(
    private val api:QuoteApiClient
){

    suspend fun getQuotes():List<QuoteModel> {
        return  withContext(Dispatchers.IO) {
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}