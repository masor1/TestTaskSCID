package com.masorone.testtaskscid.presentation

import androidx.recyclerview.widget.DiffUtil
import com.masorone.testtaskscid.data.DataItemData

class DataDiffCallback : DiffUtil.ItemCallback<DataItemData>() {

    override fun areItemsTheSame(oldItem: DataItemData, newItem: DataItemData): Boolean {
        return oldItem.areItemsTheSame(newItem)
    }

    override fun areContentsTheSame(oldItem: DataItemData, newItem: DataItemData): Boolean {
        return oldItem.areContentsTheSame(newItem)
    }
}