package com.restu.mvvmcleanapplication.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.restu.mvvmcleanapplication.domain.usecase.GetMoviesUseCase
import com.restu.mvvmcleanapplication.domain.usecase.UpdateMoviesUsecase


class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }

    }





