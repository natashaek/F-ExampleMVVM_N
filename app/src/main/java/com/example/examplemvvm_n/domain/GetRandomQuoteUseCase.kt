package com.example.examplemvvm_n.domain

import com.example.examplemvvm_n.data.QuoteRepository
import com.example.examplemvvm_n.data.model.QuoteModel
import com.example.examplemvvm_n.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val repository : QuoteRepository,
) {

    suspend operator fun invoke(): Quote?{
        val quotes = repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}