package com.restu.mvvmcleanapplication.data.model


import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>

)