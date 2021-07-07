package com.example.quoran.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "verset_table")
data class Verset(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val text_ar: String,
    val text_an: String,
    val sourat_id: Int,
    val verset_sourat_id: Int,
    val page: Int,
    val nbr_mots: Int
)