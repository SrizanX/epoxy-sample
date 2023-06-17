package com.srizan.epoxysample.entity

data class Task(
    val position: Int,
    val icon: Int,
    val title: String,
    val action: String,
    val actionIcon: Int,
    val isSelected: Boolean = false
)