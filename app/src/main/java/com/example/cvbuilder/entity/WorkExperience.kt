package com.example.cvbuilder.entity

import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
data class WorkExperience(
    @PrimaryKey(autoGenerate = true)
    val idNum: Long,
    val image_Url: Int,
    val job_Title: String,
    val companyName: String,
    val date_duration: String,
    val companyLocation: String,
    val role: String
)