package com.example.examplemvvm_n.data

import com.example.examplemvvm_n.data.database.dao.QuoteDao
import com.example.examplemvvm_n.data.database.entities.QuoteEntity
import com.example.examplemvvm_n.data.model.QuoteModel
import com.example.examplemvvm_n.data.model.network.QuoteService
import com.example.examplemvvm_n.domain.model.Quote
import com.example.examplemvvm_n.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api:QuoteService,
    private val quoteDao: QuoteDao
) {

    suspend fun getAllQuotesFromApi():List<Quote> {
        val response: List<QuoteModel> = api.getQuotes()
        return response.map{ it.toDomain()}
    }

    suspend fun getAllQuotesFromDatabase():List<Quote>{
        val response = quoteDao.getAllQuotes()
        return response.map{ it.toDomain()}
    }

    suspend fun insertQuotes(quotes: List<QuoteEntity>) {
         quoteDao.insertAll(quotes)
    }

    suspend fun clearQuotes() {
        quoteDao.deleteAllQuotes()
    }
}