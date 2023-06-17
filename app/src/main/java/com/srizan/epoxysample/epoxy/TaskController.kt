package com.srizan.epoxysample.epoxy

import android.view.View
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.group
import com.srizan.epoxysample.Datasource.taskExecutorCarouselItems
import com.srizan.epoxysample.Datasource.taskList
import com.srizan.epoxysample.R

class TaskController(
    val onTaskExecutorItemClick: View.OnClickListener,
    val onTaskItemClick: (Int) -> Unit,
) : EpoxyController() {
    override fun buildModels() {

        val horizontalList: MutableList<TaskExecutorModel_> = mutableListOf()

        taskExecutorCarouselItems.forEach {
            horizontalList.add(
                TaskExecutorModel_()
                    .id(it.id)
                    .name(it.name)
                    .category(it.category)
                    .isTaskAssigned(it.isAssigned)
                    .onClick(onTaskExecutorItemClick)
            )
        }

        CarouselModel_()
            .id("carousal")
            .models(horizontalList)
            .addTo(this)

        group {
            id("group")
            layout(R.layout.item_group)
            header {
                id("")
                header("Close all the personal tasks")
            }

            taskList.forEachIndexed { index, task ->
                task {
                    id(index)
                    position(task.position)
                    iconId(task.icon)
                    title(task.title)
                    actionName(task.action)
                    isSelected(task.isSelected)
                    onCLick {
                        this@TaskController.onTaskItemClick(it)
                        this@TaskController.requestModelBuild()
                    }
                }
            }
            button {
                id("button")
                text("Confirm Task")

            }
        }


    }
}