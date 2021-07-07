package com.example.quoran.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.quoran.data.Repository
import com.example.quoran.data.Verset
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val repository: Repository
) : ViewModel() {

    val readData = repository.readData().asLiveData()

    fun insertData(verset: Verset){
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertData(verset)
        }
    }

    fun searchDatabase(searchQuery: String): LiveData<List<Verset>> {
        return repository.searchDatabase(searchQuery).asLiveData()
    }

}