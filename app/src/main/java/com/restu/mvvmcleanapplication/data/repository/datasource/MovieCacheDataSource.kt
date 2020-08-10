package com.restu.mvvmcleanapplication.data.repository.datasource

import com.restu.mvvmcleanapplication.data.model.Movie


interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}