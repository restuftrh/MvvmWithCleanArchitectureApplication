package com.restu.mvvmcleanapplication.presentation

import android.app.Application
import com.restu.mvvmcleanapplication.BuildConfig
import com.restu.mvvmcleanapplication.presentation.di.Injector
import com.restu.mvvmcleanapplication.presentation.di.MovieSubComponent
import com.restu.mvvmcleanapplication.presentation.di.core.*
import javax.inject.Inject

class App : Application(), Injector {
private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

//    override fun createTvShowSubComponent(): TvShowSubComponent {
//       return appComponent.tvShowSubComponent().create()
//    }
//
//    override fun createArtistSubComponent(): ArtistSubComponent {
//        return appComponent.artistSubComponent().create()
//    }

}