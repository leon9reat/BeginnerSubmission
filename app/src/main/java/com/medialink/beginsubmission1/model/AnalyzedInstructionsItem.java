package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AnalyzedInstructionsItem implements Parcelable {

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.name);
		dest.writeList(this.steps);
	}

	public AnalyzedInstructionsItem() {
	}

	protected AnalyzedInstructionsItem(Parcel in) {
		this.name = in.readString();
		this.steps = new ArrayList<StepsItem>();
		in.readList(this.steps, StepsItem.class.getClassLoader());
	}

	public static final Parcelable.Creator<AnalyzedInstructionsItem> CREATOR = new Parcelable.Creator<AnalyzedInstructionsItem>() {
		@Override
		public AnalyzedInstructionsItem createFromParcel(Parcel source) {
			return new AnalyzedInstructionsItem(source);
		}

		@Override
		public AnalyzedInstructionsItem[] newArray(int size) {
			return new AnalyzedInstructionsItem[size];
		}
	};
}