package com.restu.mvvmcleanapplication.domain.repository

import com.restu.mvvmcleanapplication.data.model.Movie


interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}