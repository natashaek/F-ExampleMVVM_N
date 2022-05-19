package com.example.examplemvvm_n.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.examplemvvm_n.data.database.dao.QuoteDao
import com.example.examplemvvm_n.data.database.entities.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDatabase: RoomDatabase() {

    abstract fun getQuoteDao():QuoteDao
}