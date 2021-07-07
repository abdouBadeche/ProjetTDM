package com.example.quoran.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface VersetDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addVerset(verset : Verset)

    @Query("SELECT * from verset_table order by id asc ")
    fun readAllData() : Flow<List<Verset>>

    @Query("SELECT * FROM verset_table WHERE text_ar LIKE :searchQuery OR text_an LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<Verset>>


}