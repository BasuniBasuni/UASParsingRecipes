package com.example.recipesjson.model

import com.google.gson.annotations.SerializedName
data class Recipe(
    val id: Int,
    val name: String,
    val ingredients: List<String>,
    val instructions: List<String>,
    val cookTimeMinutes: Int,
    val difficulty: String,
    val cuisine: String,
    val image: String // Tambahkan ini
)

/*
data class Recipe(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("ingredients")
    val ingredients: List<String>,

    @SerializedName("instructions")
    val instructions: List<String>,

    @SerializedName("prepTimeMinutes")
    val prepTimeMinutes: Int,

    @SerializedName("cookTimeMinutes")
    val cookTimeMinutes: Int,

    @SerializedName("servings")
    val servings: Int,

    @SerializedName("difficulty")
    val difficulty: String,

    @SerializedName("cuisine")
    val cuisine: String,

    @SerializedName("caloriesPerServing")
    val caloriesPerServing: Int,

    @SerializedName("tags")
    val tags: List<String>,

    @SerializedName("userId")
    val userId: Int,

    @SerializedName("image")
    val image: String,

    @SerializedName("rating")
    val rating: Double,

    @SerializedName("reviewCount")
    val reviewCount: Int,

    @SerializedName("mealType")
    val mealType: List<String>
)

*/
