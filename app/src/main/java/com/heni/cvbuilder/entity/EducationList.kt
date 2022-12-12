package com.heni.cvbuilder.entity

import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
data class EducationList(
    @PrimaryKey(autoGenerate = true)
    val idNum: Long,
    val image_Url: Int,
    val university: String,
    val degreeLevel: String
)