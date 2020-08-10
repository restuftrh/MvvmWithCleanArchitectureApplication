package com.restu.mvvmcleanapplication.presentation.di.core


import com.restu.mvvmcleanapplication.data.repository.datasource.MovieCacheDataSource
import com.restu.mvvmcleanapplication.data.repository.datasourcelmpl.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

//    @Singleton
//    @Provides
//    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
//        return TvShowCacheDataSourceImpl()
//    }
//
//    @Singleton
//    @Provides
//    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
//        return ArtistCacheDataSourceImpl()
//    }


}