package com.example.recipesjson.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipesjson.R
import com.example.recipesjson.model.Recipe
import com.squareup.picasso.Picasso

class RecipeAdapter(private val recipeList: List<Recipe>) : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvCuisine: TextView = view.findViewById(R.id.tvCuisine)
        val tvIngredients: TextView = view.findViewById(R.id.tvIngredients)
        val tvInstructions: TextView = view.findViewById(R.id.tvInstructions)
        val imgRecipe: ImageView = view.findViewById(R.id.imgRecipe)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_recipe, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = recipeList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipeList[position]
        holder.tvName.text = recipe.name
        holder.tvCuisine.text = "Cuisine: ${recipe.cuisine}"
        holder.tvIngredients.text = "Ingredients: ${recipe.ingredients.joinToString(", ")}"
        holder.tvInstructions.text = "Instructions: ${recipe.instructions.take(1).joinToString()}" // tampilkan langkah pertama

        // Load gambar pakai URL dari API jika ada
        // Kalau DummyJSON punya URL gambar, gunakan ini:
        // Picasso.get().load(recipe.image).into(holder.imgRecipe)

        // Sementara, load gambar dummy dari drawable (atau dari internet)
        Picasso.get()
            .load(recipe.image)
            .placeholder(R.drawable.ic_launcher_background) // saat loading
            .error(R.drawable.ic_launcher_foreground)       // jika gagal load
            .into(holder.imgRecipe)

    }
}
