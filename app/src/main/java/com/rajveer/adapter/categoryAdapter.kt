package com.rajveer.adapter

import android.media.MediaRouter.RouteCategory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rajveer.baktisagar.databinding.CatagoryItemRecyclerRowBinding
import com.rajveer.baktisagar.models.CategoryModel
import java.util.Locale.Category

class categoryAdapter(private val categoryList:List<CategoryModel>):
    RecyclerView.Adapter<categoryAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: CatagoryItemRecyclerRowBinding):
        RecyclerView.ViewHolder(binding.root){
            //bind the data with views
            fun bindData(category: CategoryModel){
                binding.nameTextView.text=category.name
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = CatagoryItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
     return  categoryList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(categoryList[position])

    }

}