package com.trainee.core.data.repository

interface CharactersRemoteDataSource<T> {
    suspend fun fetchCharacters(queries: HashMap<String, String>): T
}