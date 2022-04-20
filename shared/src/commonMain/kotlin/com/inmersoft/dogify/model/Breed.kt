package com.inmersoft.dogify.model

data class Breed(
    val name: String, val imageUrl: String,
    val isFavourite: Boolean = false
)