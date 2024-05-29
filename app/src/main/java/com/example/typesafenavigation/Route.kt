package com.example.typesafenavigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Route
{
    @Serializable
    data object Home : Route()

    @Serializable
    data class Profile(
        val name: String?,
        val age: String
    ) : Route()
}