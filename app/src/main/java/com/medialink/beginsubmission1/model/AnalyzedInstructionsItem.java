package com.medialink.beginsubmission1.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnalyzedInstructionsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("steps")
	private List<StepsItem> steps;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSteps(List<StepsItem> steps){
		this.steps = steps;
	}

	public List<StepsItem> getSteps(){
		return steps;
	}

	@Override
 	public String toString(){
		return 
			"AnalyzedInstructionsItem{" + 
			"name = '" + name + '\'' + 
			",steps = '" + steps + '\'' + 
			"}";
		}
}