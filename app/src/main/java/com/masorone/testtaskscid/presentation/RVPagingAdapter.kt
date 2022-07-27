package com.masorone.testtaskscid.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.masorone.testtaskscid.data.DataItemData
import com.masorone.testtaskscid.databinding.RecyclerItemBinding

class RVPagingAdapter :
    PagingDataAdapter<DataItemData, RVPagingAdapter.DataViewHolder>(DataDiffCallback()) {

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = getItem(position)!!
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(
            RecyclerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    inner class DataViewHolder(private val binding: RecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(itemData: DataItemData) {
            itemData.setContent(binding)
        }
    }
}