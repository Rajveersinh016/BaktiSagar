package com.rajveer.baktisagar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.rajveer.adapter.categoryAdapter
import com.rajveer.baktisagar.databinding.CatagoryItemRecyclerRowBinding
import com.rajveer.baktisagar.databinding.FragmentMusicBinding
import com.rajveer.baktisagar.models.CategoryModel


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



class MusicFragment : Fragment() {

        lateinit var binding: FragmentMusicBinding
        lateinit var categoryAdapter: categoryAdapter
        fun newInstance(param1: String, param2: String) =
            MusicFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    binding = FragmentMusicBinding.inflate(layoutInflater)


                    getCategories()

                }






            }


    fun getCategories(){
        FirebaseFirestore.getInstance().collection("category")
            .get().addOnSuccessListener {
                val categoryList = it.toObjects(CategoryModel::class.java)
                setUpCategoryRecyclerview(categoryList)
            }
    }

    fun setUpCategoryRecyclerview(categoryList: List<CategoryModel>){
        categoryAdapter = categoryAdapter(categoryList)
        binding.CategoriesRecyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.CategoriesRecyclerView.adapter = categoryAdapter

    }
    }
