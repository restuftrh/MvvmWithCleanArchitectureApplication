package com.restu.mvvmcleanapplication.data.repository.datasource

import com.restu.mvvmcleanapplication.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}