package com.restu.mvvmcleanapplication.presentation.di.core


import com.restu.mvvmcleanapplication.data.repository.MovieRepositoryImpl
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieCacheDataSource
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieLocalDataSource
import com.restu.mvvmcleanapplication.data.repository.datasource.MovieRemoteDatasource
import com.restu.mvvmcleanapplication.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

//    @Provides
//    @Singleton
//    fun provideTvShowRepository(
//        tvShowRemoteDatasource: TvShowRemoteDatasource,
//        tvShowLocalDataSource: TvShowLocalDataSource,
//        tvShowCacheDataSource: TvShowCacheDataSource
//    ): TvShowRepository {
//
//        return TvShowRepositoryImpl(
//            tvShowRemoteDatasource,
//            tvShowLocalDataSource,
//            tvShowCacheDataSource
//        )
//
//
//    }
//
//    @Provides
//    @Singleton
//    fun provideArtistRepository(
//        artistRemoteDatasource: ArtistRemoteDatasource,
//        artistLocalDataSource: ArtistLocalDataSource,
//        artistCacheDataSource: ArtistCacheDataSource
//    ): ArtistRepository {
//
//        return ArtistRepositoryImpl(
//            artistRemoteDatasource,
//            artistLocalDataSource,
//            artistCacheDataSource
//        )
//
//
//    }

}