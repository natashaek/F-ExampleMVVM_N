package com.example.examplemvvm_n.domain

import com.example.examplemvvm_n.data.QuoteRepository
import com.example.examplemvvm_n.data.model.QuoteModel
import com.example.examplemvvm_n.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    private val repository = QuoteRepository()

    operator fun invoke():QuoteModel?{
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}