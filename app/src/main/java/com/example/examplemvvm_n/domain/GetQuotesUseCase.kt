package com.example.examplemvvm_n.domain

import com.example.examplemvvm_n.data.QuoteRepository
import com.example.examplemvvm_n.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}