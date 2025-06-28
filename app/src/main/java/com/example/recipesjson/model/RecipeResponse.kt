package com.example.recipesjson.model

import com.google.gson.annotations.SerializedName
data class RecipeResponse(
    val recipes: List<Recipe>
)

/*
data class RecipeResponse(
    @SerializedName("recipes")
    val recipes: List<Recipe>,

    @SerializedName("total")
    val total: Int? = null,

    @SerializedName("skip")
    val skip: Int? = null,

    @SerializedName("limit")
    val limit: Int? = null

)
*/
