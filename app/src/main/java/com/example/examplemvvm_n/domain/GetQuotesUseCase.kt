package com.example.examplemvvm_n.domain

import com.example.examplemvvm_n.data.QuoteRepository
import com.example.examplemvvm_n.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository: QuoteRepository
){

    suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}