package com.example.marvelapp.framework.remote

import com.example.marvelapp.framework.network.MarvelApi
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import com.trainee.core.data.repository.CharactersRemoteDataSource
import javax.inject.Inject

class RetrofitCharactersDataSource @Inject constructor(
    private val marvelApi: MarvelApi
) : CharactersRemoteDataSource<DataWrapperResponse> {

    override suspend fun fetchCharacters(queries: HashMap<String, String>): DataWrapperResponse {
        return marvelApi.getCharacters(queries)
    }
}