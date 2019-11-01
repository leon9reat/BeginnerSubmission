package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class StepsItem implements Parcelable {

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(this.number);
		dest.writeParcelable(this.length, flags);
		dest.writeList(this.ingredients);
		dest.writeList(this.equipment);
		dest.writeString(this.step);
	}

	public StepsItem() {
	}

	protected StepsItem(Parcel in) {
		this.number = in.readInt();
		this.length = in.readParcelable(Length.class.getClassLoader());
		this.ingredients = new ArrayList<IngredientsItem>();
		in.readList(this.ingredients, IngredientsItem.class.getClassLoader());
		this.equipment = new ArrayList<Object>();
		in.readList(this.equipment, Object.class.getClassLoader());
		this.step = in.readString();
	}

	public static final Parcelable.Creator<StepsItem> CREATOR = new Parcelable.Creator<StepsItem>() {
		@Override
		public StepsItem createFromParcel(Parcel source) {
			return new StepsItem(source);
		}

		@Override
		public StepsItem[] newArray(int size) {
			return new StepsItem[size];
		}
	};
}