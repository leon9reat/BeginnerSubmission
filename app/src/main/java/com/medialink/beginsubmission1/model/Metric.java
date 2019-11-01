package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Metric implements Parcelable {

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
			"Metric{" + 
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

	public Metric() {
	}

	protected Metric(Parcel in) {
		this.amount = in.readDouble();
		this.unitShort = in.readString();
		this.unitLong = in.readString();
	}

	public static final Parcelable.Creator<Metric> CREATOR = new Parcelable.Creator<Metric>() {
		@Override
		public Metric createFromParcel(Parcel source) {
			return new Metric(source);
		}

		@Override
		public Metric[] newArray(int size) {
			return new Metric[size];
		}
	};
}