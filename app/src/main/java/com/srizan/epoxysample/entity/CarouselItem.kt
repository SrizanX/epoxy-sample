package com.srizan.epoxysample.entity

data class CarouselItem(
    val id: String,
    val name: String,
    val category: String,
    val isAssigned: Boolean = false
)