package com.example.quoran.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val versetDao: VersetDao
) {

    fun readData(): Flow<List<Verset>> {
        return versetDao.readAllData()
    }

    suspend fun insertData(verset: Verset) {
        versetDao.addVerset(verset)
    }

    fun searchDatabase(searchQuery: String): Flow<List<Verset>> {
        return versetDao.searchDatabase(searchQuery)
    }

}