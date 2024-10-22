package com.tacuchi.lets_meet.domain.entity

data class Meeting(
    val id: String,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val latitude: Double,
    val longitude: Double,
    val creatorId: String,
    val creatorName: String,
    val creatorImageUrl: String,
    val participants: List<Participant>
)