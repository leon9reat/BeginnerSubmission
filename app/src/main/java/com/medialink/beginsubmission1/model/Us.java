package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Us implements Parcelable {

	@SerializedName("amount")
	private double amount;

	@SerializedName("unitShort")
	private String unitShort;

	@SerializedName("unitLong")
	private String unitLong;

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	public void setUnitShort(String unitShort){
		this.unitShort = unitShort;
	}

	public String getUnitShort(){
		return unitShort;
	}

	public void setUnitLong(String unitLong){
		this.unitLong = unitLong;
	}

	public String getUnitLong(){
		return unitLong;
	}

	@Override
 	public String toString(){
		return 
			"Us{" + 
			"amount = '" + amount + '\'' + 
			",unitShort = '" + unitShort + '\'' + 
			",unitLong = '" + unitLong + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeDouble(this.amount);
		dest.writeString(this.unitShort);
		dest.writeString(this.unitLong);
	}

	public Us() {
	}

	protected Us(Parcel in) {
		this.amount = in.readDouble();
		this.unitShort = in.readString();
		this.unitLong = in.readString();
	}

	public static final Parcelable.Creator<Us> CREATOR = new Parcelable.Creator<Us>() {
		@Override
		public Us createFromParcel(Parcel source) {
			return new Us(source);
		}

		@Override
		public Us[] newArray(int size) {
			return new Us[size];
		}
	};
}