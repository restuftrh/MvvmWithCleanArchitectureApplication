package com.restu.mvvmcleanapplication.data.repository.datasourcelmpl

import com.restu.mvvmcleanapplication.data.db.MovieDao
import com.restu.mvvmcleanapplication.data.model.Movie
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val movieDao: MovieDao):
    MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
       return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           movieDao.deleteAllMovies()
       }
    }
}