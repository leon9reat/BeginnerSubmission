package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Length implements Parcelable {

	@SerializedName("number")
	private int number;

	@SerializedName("unit")
	private String unit;

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
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
			"Length{" + 
			"number = '" + number + '\'' + 
			",unit = '" + unit + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(this.number);
		dest.writeString(this.unit);
	}

	public Length() {
	}

	protected Length(Parcel in) {
		this.number = in.readInt();
		this.unit = in.readString();
	}

	public static final Parcelable.Creator<Length> CREATOR = new Parcelable.Creator<Length>() {
		@Override
		public Length createFromParcel(Parcel source) {
			return new Length(source);
		}

		@Override
		public Length[] newArray(int size) {
			return new Length[size];
		}
	};
}