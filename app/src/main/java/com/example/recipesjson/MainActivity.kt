package com.example.recipesjson

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipesjson.adapter.RecipeAdapter
import com.example.recipesjson.model.RecipeResponse
import com.example.recipesjson.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var rvRecipes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi RecyclerView
        rvRecipes = findViewById(R.id.rvRecipes)
        rvRecipes.layoutManager = LinearLayoutManager(this)

        // Panggil API
        val client = ApiConfig.getApiService().getRecipes()
        client.enqueue(object : Callback<RecipeResponse> {
            override fun onResponse(call: Call<RecipeResponse>, response: Response<RecipeResponse>) {
                if (response.isSuccessful) {
                    val recipes = response.body()?.recipes ?: emptyList()

                    // Tampilkan ke log
                    for (recipe in recipes) {
                        Log.d("RecipeName", recipe.name)
                        Log.d("Ingredients", recipe.ingredients.joinToString())
                        Log.d("Instructions", recipe.instructions.joinToString())
                        Log.d("CookTime", recipe.cookTimeMinutes.toString())
                        Log.d("Difficulty", recipe.difficulty)
                        Log.d("Cuisine", recipe.cuisine)
                    }

                    // Tampilkan ke RecyclerView
                    val adapter = RecipeAdapter(recipes)
                    rvRecipes.adapter = adapter
                } else {
                    Log.e("MainActivity", "Gagal: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<RecipeResponse>, t: Throwable) {
                Log.e("MainActivity", "Error: ${t.message}")
            }
        })
    }
}
