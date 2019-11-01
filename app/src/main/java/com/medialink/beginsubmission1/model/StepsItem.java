package com.medialink.beginsubmission1.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StepsItem{

	@SerializedName("number")
	private int number;

	@SerializedName("length")
	private Length length;

	@SerializedName("ingredients")
	private List<IngredientsItem> ingredients;

	@SerializedName("equipment")
	private List<Object> equipment;

	@SerializedName("step")
	private String step;

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setLength(Length length){
		this.length = length;
	}

	public Length getLength(){
		return length;
	}

	public void setIngredients(List<IngredientsItem> ingredients){
		this.ingredients = ingredients;
	}

	public List<IngredientsItem> getIngredients(){
		return ingredients;
	}

	public void setEquipment(List<Object> equipment){
		this.equipment = equipment;
	}

	public List<Object> getEquipment(){
		return equipment;
	}

	public void setStep(String step){
		this.step = step;
	}

	public String getStep(){
		return step;
	}

	@Override
 	public String toString(){
		return 
			"StepsItem{" + 
			"number = '" + number + '\'' + 
			",length = '" + length + '\'' + 
			",ingredients = '" + ingredients + '\'' + 
			",equipment = '" + equipment + '\'' + 
			",step = '" + step + '\'' + 
			"}";
		}
}