package com.example.examplemvvm_n.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel (@SerializedName("quote") val quote:String, @SerializedName("author") val author:String) {
}