package com.masorone.testtaskscid.data

import com.masorone.testtaskscid.databinding.RecyclerItemBinding

data class DataItemData(
    private val id: Int,
    private val name: String,
    private val description: String,
    private val date: String
) {

    fun areItemsTheSame(newItem: DataItemData): Boolean {
        return id == newItem.id
    }

    fun areContentsTheSame(newItem: DataItemData): Boolean {
        return this == newItem
    }

    fun setContent(binding: RecyclerItemBinding) {
        binding.name.text = name
    }
}