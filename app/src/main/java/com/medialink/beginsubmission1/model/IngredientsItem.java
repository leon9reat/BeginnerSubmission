package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class IngredientsItem implements Parcelable {

	@SerializedName("image")
	private String image;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"IngredientsItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.image);
		dest.writeString(this.name);
		dest.writeInt(this.id);
	}

	public IngredientsItem() {
	}

	protected IngredientsItem(Parcel in) {
		this.image = in.readString();
		this.name = in.readString();
		this.id = in.readInt();
	}

	public static final Parcelable.Creator<IngredientsItem> CREATOR = new Parcelable.Creator<IngredientsItem>() {
		@Override
		public IngredientsItem createFromParcel(Parcel source) {
			return new IngredientsItem(source);
		}

		@Override
		public IngredientsItem[] newArray(int size) {
			return new IngredientsItem[size];
		}
	};
}