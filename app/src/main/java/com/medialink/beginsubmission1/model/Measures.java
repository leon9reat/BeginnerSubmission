package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Measures implements Parcelable {

	@SerializedName("metric")
	private Metric metric;

	@SerializedName("us")
	private Us us;

	public void setMetric(Metric metric){
		this.metric = metric;
	}

	public Metric getMetric(){
		return metric;
	}

	public void setUs(Us us){
		this.us = us;
	}

	public Us getUs(){
		return us;
	}

	@Override
 	public String toString(){
		return 
			"Measures{" + 
			"metric = '" + metric + '\'' + 
			",us = '" + us + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.metric, flags);
		dest.writeParcelable(this.us, flags);
	}

	public Measures() {
	}

	protected Measures(Parcel in) {
		this.metric = in.readParcelable(Metric.class.getClassLoader());
		this.us = in.readParcelable(Us.class.getClassLoader());
	}

	public static final Parcelable.Creator<Measures> CREATOR = new Parcelable.Creator<Measures>() {
		@Override
		public Measures createFromParcel(Parcel source) {
			return new Measures(source);
		}

		@Override
		public Measures[] newArray(int size) {
			return new Measures[size];
		}
	};
}