package com.example.examplemvvm_n.domain.model

import com.example.examplemvvm_n.data.database.entities.QuoteEntity
import com.example.examplemvvm_n.data.model.QuoteModel

data class Quote (val quote:String, val author:String)

fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)