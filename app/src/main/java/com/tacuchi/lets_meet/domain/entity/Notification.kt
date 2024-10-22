package com.tacuchi.lets_meet.domain.entity

data class Notification(
    val id: String,
    val title: String,
    val body: String,
    val date: String,
    val read: Boolean
)