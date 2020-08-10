package com.restu.mvvmcleanapplication.data.repository.datasourcelmpl

import com.restu.mvvmcleanapplication.data.model.Movie
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieCacheDataSource


class MovieCacheDataSourceImpl :
    MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
       movieList = ArrayList(movies)
    }
}