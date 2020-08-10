package com.restu.mvvmcleanapplication.presentation.di.core

import com.restu.mvvmcleanapplication.data.api.TMDBService
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieRemoteDatasource
import com.restu.mvvmcleanapplication.data.repository.datasourcelmpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

//    @Singleton
//    @Provides
//    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
//        return TvShowRemoteDataSourceImpl(
//            tmdbService, apiKey
//        )
//    }
//
//    @Singleton
//    @Provides
//    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
//        return ArtistRemoteDataSourceImpl(
//            tmdbService, apiKey
//        )
//    }


}