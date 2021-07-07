package com.example.quoran.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "racine_table")
data class Racine(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val racine: String,
)