package com.example.recipesjson.network

import com.example.recipesjson.model.Recipe
import com.example.recipesjson.model.RecipeResponse
import retrofit2.Response
import retrofit2.http.Path
import retrofit2.http.Query

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("recipes")
    fun getRecipes(): Call<RecipeResponse>
}

/*
interface ApiService {
    @GET("recipes")
    suspend fun getAllRecipes(): Response<RecipeResponse>

    @GET("recipes")
    suspend fun getRecipes(
        @Query("limit") limit: Int = 10,
        @Query("skip") skip: Int = 0
    ): Response<RecipeResponse>

    @GET("recipes/{id}")
    suspend fun getRecipeById(
        @Path("id") id: Int
    ): Response<Recipe>

    @GET("recipes/search")
    suspend fun searchRecipes(
        @Query("q") query: String
    ): Response<RecipeResponse>

    @GET("recipes/meal-type/{mealType}")
    suspend fun getRecipesByMealType(
        @Path("mealType") mealType: String
    ): Response<RecipeResponse>

    // Non-suspend versions (if you prefer using Callback)
    @GET("recipes")
    fun getAllRecipesCallback(): Call<RecipeResponse>

    @GET("recipes/{id}")
    fun getRecipeByIdCallback(
        @Path("id") id: Int
    ): Call<Recipe>

}*/
