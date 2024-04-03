package com.example.recipe.ui.viewmodel

sealed  class RecipeViewIntent {
    object LoadingRandomRecipe: RecipeViewIntent()
    data class SearchRecipes(val query: String) : RecipeViewIntent( )
}