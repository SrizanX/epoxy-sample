package com.srizan.epoxysample.epoxy

import androidx.core.content.ContextCompat
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.srizan.epoxysample.R
import com.srizan.epoxysample.databinding.ItemTaskBinding
import com.srizan.epoxysample.epoxy.helpers.ViewBindingEpoxyModelWithHolder


@EpoxyModelClass(layout = R.layout.item_task)
abstract class TaskModel : ViewBindingEpoxyModelWithHolder<ItemTaskBinding>() {

    @field:EpoxyAttribute
    open var position: Int = 0

    @field:EpoxyAttribute
    lateinit var title: String

    @field:EpoxyAttribute
    lateinit var actionName: String

    @field:EpoxyAttribute
    open var iconId: Int = 0


    @field:EpoxyAttribute
    open var isSelected = false

    @field:EpoxyAttribute
    lateinit var onCLick: (Int) -> Unit


    override fun ItemTaskBinding.bind() {


        taskTitleTv.text = title
        actionNameTv.text = actionName

        val drawable = ContextCompat.getDrawable(this.root.context, iconId)
        iconIv.setImageDrawable(drawable)
        if (isSelected.not())
            card.setCardBackgroundColor(
                ContextCompat.getColor(
                    root.context,
                    R.color.light_blue
                )
            )
        else {
            card.setCardBackgroundColor(ContextCompat.getColor(root.context, R.color.black))
        }
        root.setOnClickListener {
            onCLick(position)
        }

    }
}

