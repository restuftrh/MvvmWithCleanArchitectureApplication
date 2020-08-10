package com.restu.mvvmcleanapplication.data.repository.datasourcelmpl

import com.restu.mvvmcleanapplication.data.api.TMDBService
import com.restu.mvvmcleanapplication.data.model.MovieList
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

