package com.restu.mvvmcleanapplication.presentation.di.core


import com.restu.mvvmcleanapplication.presentation.di.MovieSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {

fun movieSubComponent(): MovieSubComponent.Factory
//fun tvShowSubComponent():TvShowSubComponent.Factory
//fun artistSubComponent():ArtistSubComponent.Factory

}