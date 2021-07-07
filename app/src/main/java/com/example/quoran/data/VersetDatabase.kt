package com.example.quoran.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Verset::class] , version = 1 , exportSchema = false)
abstract class VersetDatabase : RoomDatabase() {
    abstract  fun versetDao() : VersetDao

    companion object{
        @Volatile
        private  var INSTANCE : VersetDatabase? = null

        fun getDatabase(context: Context) :  VersetDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext ,
                    VersetDatabase::class.java ,
                    "verset_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}