package com.restu.mvvmcleanapplication.presentation.di


import com.restu.mvvmcleanapplication.domain.usecase.GetMoviesUseCase
import com.restu.mvvmcleanapplication.domain.usecase.UpdateMoviesUsecase
import com.restu.mvvmcleanapplication.presentation.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}