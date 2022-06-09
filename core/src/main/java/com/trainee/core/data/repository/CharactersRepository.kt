package com.trainee.core.data.repository

import androidx.paging.PagingSource
import com.trainee.core.domain.model.Character

interface CharactersRepository {
    fun getCharacters(query: String): PagingSource<Int, Character>
}