package com.restu.mvvmcleanapplication.domain.usecase

import com.restu.mvvmcleanapplication.data.model.Movie
import com.restu.mvvmcleanapplication.domain.repository.MovieRepository


class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}