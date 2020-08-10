package com.restu.mvvmcleanapplication.data.api

import com.restu.mvvmcleanapplication.data.model.MovieList
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ): retrofit2.Response<MovieList>

//    @GET("tv/popular")
//    suspend fun getPopularTvShows(
//        @Query(
//            "api_key"
//        ) apiKey: String
//    ): Response<TvShowList>
//
//    @GET("person/popular")
//    suspend fun getPopularArtists(
//        @Query(
//            "api_key"
//        ) apiKey: String
//    ): Response<ArtistList>




}