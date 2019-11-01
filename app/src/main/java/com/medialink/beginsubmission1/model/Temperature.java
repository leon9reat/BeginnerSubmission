package com.medialink.beginsubmission1.model;

import com.google.gson.annotations.SerializedName;

public class Temperature{

	@SerializedName("number")
	private double number;

	@SerializedName("unit")
	private String unit;

	public void setNumber(double number){
		this.number = number;
	}

	public double getNumber(){
		return number;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	@Override
 	public String toString(){
		return 
			"Temperature{" + 
			"number = '" + number + '\'' + 
			",unit = '" + unit + '\'' + 
			"}";
		}
}