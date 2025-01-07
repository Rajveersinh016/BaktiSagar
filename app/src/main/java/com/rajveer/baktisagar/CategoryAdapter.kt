package com.rajveer.baktisagar

import android.icu.util.ULocale
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rajveer.adapter.categoryAdapter
import com.rajveer.baktisagar.databinding.CatagoryItemRecyclerRowBinding
import com.rajveer.baktisagar.databinding.FragmentMusicBinding
import java.util.Locale.Category

class CategoryAdapter (private val categoryList: List<CategoryModel>):
    RecyclerView.Adapter<CategoryAdapter.MyviewHolder>(){


    class MyviewHolder(private val binding: CatagoryItemRecyclerRowBinding):
        RecyclerView.ViewHolder(binding.root){
            fun bindData(categoryModel: CategoryModel){
              binding.nameTextView.text = categoryModel.name

            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
       val binding = CatagoryItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyviewHolder(binding)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.bindData(categoryList[position])

    }
}