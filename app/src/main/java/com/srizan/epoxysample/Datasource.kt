package com.srizan.epoxysample

import com.srizan.epoxysample.entity.CarouselItem
import com.srizan.epoxysample.entity.Task


object Datasource {
    val taskList = mutableListOf(
        Task(
            0,
            R.drawable.ic_access_time_filled,
            "When it happen",
            action = "04:00 PM",
            actionIcon = R.drawable.ic_keyboard_arrow_down
        ),
        Task(
            1,
            R.drawable.ic_note_add,
            "Add a note",
            action = "Add",
            actionIcon = R.drawable.ic_add
        ),
        Task(
            2,
            R.drawable.ic_account_circle,
            "Attendees",
            action = "Add",
            actionIcon = R.drawable.ic_add
        ),
    )

    val taskExecutorCarouselItems = listOf(
        CarouselItem("1", "Mahdi", "Audio & Video", true),
        CarouselItem("2", "Saifullah", "Video maker"),
        CarouselItem("3", "Srizan", "Audio Engineer"),
        CarouselItem("4", "User 1", "Video Engineer"),
        CarouselItem("5", "User 2", "Software Engineer"),
        CarouselItem("6", "User 3", "Audio Engineer"),
    )
}