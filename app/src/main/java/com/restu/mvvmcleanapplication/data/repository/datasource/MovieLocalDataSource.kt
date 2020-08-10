package com.restu.mvvmcleanapplication.data.repository.datasource

import com.restu.mvvmcleanapplication.data.model.Movie


interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}