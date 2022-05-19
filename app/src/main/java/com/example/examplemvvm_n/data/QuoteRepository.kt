package com.example.examplemvvm_n.data

import com.example.examplemvvm_n.data.model.QuoteModel
import com.example.examplemvvm_n.data.model.QuoteProvider
import com.example.examplemvvm_n.data.model.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel> {
        val response:List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}