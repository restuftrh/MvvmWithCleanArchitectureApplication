package com.restu.mvvmcleanapplication.domain.usecase

import com.restu.mvvmcleanapplication.data.model.Movie
import com.restu.mvvmcleanapplication.domain.repository.MovieRepository


class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}