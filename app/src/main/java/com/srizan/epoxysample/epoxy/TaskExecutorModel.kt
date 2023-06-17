package com.srizan.epoxysample.epoxy

import android.view.View
import androidx.core.content.ContextCompat
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.srizan.epoxysample.R
import com.srizan.epoxysample.databinding.ItemTaskExecutorBinding
import com.srizan.epoxysample.epoxy.helpers.ViewBindingEpoxyModelWithHolder


@EpoxyModelClass(layout = R.layout.item_task_executor)
abstract class TaskExecutorModel : ViewBindingEpoxyModelWithHolder<ItemTaskExecutorBinding>() {

    @field:EpoxyAttribute
    lateinit var name: String

    @field:EpoxyAttribute
    lateinit var category: String

    @field:EpoxyAttribute
    open var isTaskAssigned: Boolean = false

    @field:EpoxyAttribute
    lateinit var onClick: View.OnClickListener


    override fun ItemTaskExecutorBinding.bind() {
        imageView
        nameTextView.text = name
        categoryTv.text = category


        if (isTaskAssigned) {
            val drawable = ContextCompat.getDrawable(this.root.context, R.drawable.ic_check_circle)
            executorIcon.setImageDrawable(drawable)
        } else {
            val drawable = ContextCompat.getDrawable(this.root.context, R.drawable.ic_add_circle)
            executorIcon.setImageDrawable(drawable)
        }
        executorIcon.setOnClickListener(onClick)
    }
}

