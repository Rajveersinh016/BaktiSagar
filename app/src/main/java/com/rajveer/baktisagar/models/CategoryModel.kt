package com.rajveer.baktisagar.models

data class CategoryModel(
    val name: String,
    val CoverUrl: String,
){
    constructor(): this("","")
}
