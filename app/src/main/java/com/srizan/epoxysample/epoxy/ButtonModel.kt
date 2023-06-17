package com.srizan.epoxysample.epoxy

import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.srizan.epoxysample.R
import com.srizan.epoxysample.databinding.ItemButtonBinding
import com.srizan.epoxysample.databinding.ItemHeaderBinding
import com.srizan.epoxysample.epoxy.helpers.ViewBindingEpoxyModelWithHolder


@EpoxyModelClass(layout = R.layout.item_button)
abstract class ButtonModel : ViewBindingEpoxyModelWithHolder<ItemButtonBinding>() {

    @field:EpoxyAttribute
    lateinit var text: String
    override fun ItemButtonBinding.bind() {
        button.text = text
    }
}

