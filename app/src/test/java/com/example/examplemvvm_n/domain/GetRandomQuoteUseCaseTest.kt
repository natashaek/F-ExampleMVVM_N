package com.example.examplemvvm_n.domain

import com.example.examplemvvm_n.data.QuoteRepository
import com.example.examplemvvm_n.domain.model.Quote
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetRandomQuoteUseCaseTest {
    @RelaxedMockK
    private lateinit var quoteRepository: QuoteRepository

    lateinit var getRandomQuoteUseCase: GetRandomQuoteUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getRandomQuoteUseCase = GetRandomQuoteUseCase(quoteRepository)
    }

    @Test
    fun `when database is empty then return null`() = runBlocking {

        // Given
        coEvery { quoteRepository.getAllQuotesFromDatabase() } returns emptyList()

        // When
        val response = getRandomQuoteUseCase()

        // Then
        assert(response == null)
    }

    @Test
    fun `when database is not empty then return quote`() = runBlocking {

        //Given
        val quoteList = listOf(Quote("oli", "Natt"))

        //When
        coEvery { quoteRepository.getAllQuotesFromDatabase() } returns quoteList

        //Then
        val response = getRandomQuoteUseCase()

        assert(response == quoteList.first())
    }
}