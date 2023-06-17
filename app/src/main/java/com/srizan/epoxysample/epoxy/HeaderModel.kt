package com.srizan.epoxysample.epoxy

import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.srizan.epoxysample.R
import com.srizan.epoxysample.databinding.ItemHeaderBinding
import com.srizan.epoxysample.epoxy.helpers.ViewBindingEpoxyModelWithHolder


@EpoxyModelClass(layout = R.layout.item_header)
abstract class HeaderModel : ViewBindingEpoxyModelWithHolder<ItemHeaderBinding>() {

    @field:EpoxyAttribute
    lateinit var header: String
    override fun ItemHeaderBinding.bind() {
        headerText.text = header
    }
}

