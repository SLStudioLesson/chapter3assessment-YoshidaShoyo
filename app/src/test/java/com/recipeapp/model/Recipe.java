package com.recipeapp.model;

import java.util.ArrayList;

public class Recipe {
    //レシピの名前
    private String name;
    //レシピの材料リスト
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Recipe(String name, ArrayList<Ingredient> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName(){
        return name;
    }
    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

}
