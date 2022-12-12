package com.example.cvbuilder.entity

import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Serializable
data class MyCertificationList(
    @PrimaryKey(autoGenerate = true)
    val idNum: Long,
    val image_Url: Int,
    val title: String,
    val date: Int
)