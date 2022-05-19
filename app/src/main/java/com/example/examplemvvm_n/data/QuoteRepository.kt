package com.example.examplemvvm_n.data

import com.example.examplemvvm_n.data.model.QuoteModel
import com.example.examplemvvm_n.data.model.QuoteProvider
import com.example.examplemvvm_n.data.model.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api:QuoteService,
    private val quoteProvider: QuoteProvider
) {

    suspend fun getAllQuotes():List<QuoteModel> {
        val response:List<QuoteModel> = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}