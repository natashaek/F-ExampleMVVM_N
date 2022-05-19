package com.example.examplemvvm_n.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm_n.model.QuoteModel
import com.example.examplemvvm_n.model.QuoteProvider

class QuoteViewModel : ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}