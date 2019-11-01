package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Temperature implements Parcelable {

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeDouble(this.number);
		dest.writeString(this.unit);
	}

	public Temperature() {
	}

	protected Temperature(Parcel in) {
		this.number = in.readDouble();
		this.unit = in.readString();
	}

	public static final Parcelable.Creator<Temperature> CREATOR = new Parcelable.Creator<Temperature>() {
		@Override
		public Temperature createFromParcel(Parcel source) {
			return new Temperature(source);
		}

		@Override
		public Temperature[] newArray(int size) {
			return new Temperature[size];
		}
	};
}