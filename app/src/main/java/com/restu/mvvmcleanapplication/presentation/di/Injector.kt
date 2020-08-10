package com.restu.mvvmcleanapplication.presentation.di


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
//   fun createTvShowSubComponent():TvShowSubComponent
//   fun createArtistSubComponent():ArtistSubComponent
}