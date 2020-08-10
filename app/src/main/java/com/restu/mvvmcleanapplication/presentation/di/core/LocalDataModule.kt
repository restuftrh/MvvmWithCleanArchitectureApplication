package com.restu.mvvmcleanapplication.presentation.di.core

import com.restu.mvvmcleanapplication.data.db.MovieDao
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieLocalDataSource
import com.restu.mvvmcleanapplication.data.repository.datasourcelmpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

//    @Singleton
//    @Provides
//    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
//        return TvShowLocalDataSourceImpl(tvShowDao)
//    }
//
//    @Singleton
//    @Provides
//    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
//        return ArtistLocalDataSourceImpl(artistDao)
//    }


}