package com.restu.mvvmcleanapplication.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.restu.mvvmcleanapplication.data.model.Movie


@Database(entities = [Movie::class],
version = 1,
exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase(){
abstract fun movieDao(): MovieDao
//abstract fun tvDao(): TvShowDao
//abstract fun artistDao(): ArtistDao

}