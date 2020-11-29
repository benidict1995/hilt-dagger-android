package com.benidict.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String,
    val name: String,
    val username: String,
    val email: String,
    val phone: String,
    val website: String
)