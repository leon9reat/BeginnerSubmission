package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class EquipmentItem implements Parcelable {

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
			"EquipmentItem{" + 
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

	public EquipmentItem() {
	}

	protected EquipmentItem(Parcel in) {
		this.image = in.readString();
		this.name = in.readString();
		this.id = in.readInt();
	}

	public static final Parcelable.Creator<EquipmentItem> CREATOR = new Parcelable.Creator<EquipmentItem>() {
		@Override
		public EquipmentItem createFromParcel(Parcel source) {
			return new EquipmentItem(source);
		}

		@Override
		public EquipmentItem[] newArray(int size) {
			return new EquipmentItem[size];
		}
	};
}