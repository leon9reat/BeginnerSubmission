package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WinePairing implements Parcelable {

	@SerializedName("productMatches")
	private List<Object> productMatches;

	@SerializedName("pairingText")
	private String pairingText;

	@SerializedName("pairedWines")
	private List<Object> pairedWines;

	public void setProductMatches(List<Object> productMatches){
		this.productMatches = productMatches;
	}

	public List<Object> getProductMatches(){
		return productMatches;
	}

	public void setPairingText(String pairingText){
		this.pairingText = pairingText;
	}

	public String getPairingText(){
		return pairingText;
	}

	public void setPairedWines(List<Object> pairedWines){
		this.pairedWines = pairedWines;
	}

	public List<Object> getPairedWines(){
		return pairedWines;
	}

	@Override
 	public String toString(){
		return 
			"WinePairing{" + 
			"productMatches = '" + productMatches + '\'' + 
			",pairingText = '" + pairingText + '\'' + 
			",pairedWines = '" + pairedWines + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeList(this.productMatches);
		dest.writeString(this.pairingText);
		dest.writeList(this.pairedWines);
	}

	public WinePairing() {
	}

	protected WinePairing(Parcel in) {
		this.productMatches = new ArrayList<Object>();
		in.readList(this.productMatches, Object.class.getClassLoader());
		this.pairingText = in.readString();
		this.pairedWines = new ArrayList<Object>();
		in.readList(this.pairedWines, Object.class.getClassLoader());
	}

	public static final Parcelable.Creator<WinePairing> CREATOR = new Parcelable.Creator<WinePairing>() {
		@Override
		public WinePairing createFromParcel(Parcel source) {
			return new WinePairing(source);
		}

		@Override
		public WinePairing[] newArray(int size) {
			return new WinePairing[size];
		}
	};
}