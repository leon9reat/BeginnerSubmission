package com.medialink.beginsubmission1.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReceipeRespon {

	@SerializedName("recipes")
	private List<RecipesItem> recipes;

	public void setRecipes(List<RecipesItem> recipes){
		this.recipes = recipes;
	}

	public List<RecipesItem> getRecipes(){
		return recipes;
	}

	@Override
 	public String toString(){
		return 
			"ReceipeRespon{" +
			"recipes = '" + recipes + '\'' + 
			"}";
		}
}