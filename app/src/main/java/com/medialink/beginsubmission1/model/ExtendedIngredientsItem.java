package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ExtendedIngredientsItem implements Parcelable {

	@SerializedName("image")
	private String image;

	@SerializedName("amount")
	private double amount;

	@SerializedName("original")
	private String original;

	@SerializedName("consitency")
	private String consitency;

	@SerializedName("aisle")
	private String aisle;

	@SerializedName("originalName")
	private String originalName;

	@SerializedName("unit")
	private String unit;

	@SerializedName("measures")
	private Measures measures;

	@SerializedName("meta")
	private List<Object> meta;

	@SerializedName("name")
	private String name;

	@SerializedName("originalString")
	private String originalString;

	@SerializedName("id")
	private int id;

	@SerializedName("metaInformation")
	private List<Object> metaInformation;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	public void setOriginal(String original){
		this.original = original;
	}

	public String getOriginal(){
		return original;
	}

	public void setConsitency(String consitency){
		this.consitency = consitency;
	}

	public String getConsitency(){
		return consitency;
	}

	public void setAisle(String aisle){
		this.aisle = aisle;
	}

	public String getAisle(){
		return aisle;
	}

	public void setOriginalName(String originalName){
		this.originalName = originalName;
	}

	public String getOriginalName(){
		return originalName;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setMeasures(Measures measures){
		this.measures = measures;
	}

	public Measures getMeasures(){
		return measures;
	}

	public void setMeta(List<Object> meta){
		this.meta = meta;
	}

	public List<Object> getMeta(){
		return meta;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOriginalString(String originalString){
		this.originalString = originalString;
	}

	public String getOriginalString(){
		return originalString;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setMetaInformation(List<Object> metaInformation){
		this.metaInformation = metaInformation;
	}

	public List<Object> getMetaInformation(){
		return metaInformation;
	}

	@Override
 	public String toString(){
		return 
			"ExtendedIngredientsItem{" + 
			"image = '" + image + '\'' + 
			",amount = '" + amount + '\'' + 
			",original = '" + original + '\'' + 
			",consitency = '" + consitency + '\'' + 
			",aisle = '" + aisle + '\'' + 
			",originalName = '" + originalName + '\'' + 
			",unit = '" + unit + '\'' + 
			",measures = '" + measures + '\'' + 
			",meta = '" + meta + '\'' + 
			",name = '" + name + '\'' + 
			",originalString = '" + originalString + '\'' + 
			",id = '" + id + '\'' + 
			",metaInformation = '" + metaInformation + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.image);
		dest.writeDouble(this.amount);
		dest.writeString(this.original);
		dest.writeString(this.consitency);
		dest.writeString(this.aisle);
		dest.writeString(this.originalName);
		dest.writeString(this.unit);
		dest.writeParcelable(this.measures, flags);
		dest.writeList(this.meta);
		dest.writeString(this.name);
		dest.writeString(this.originalString);
		dest.writeInt(this.id);
		dest.writeList(this.metaInformation);
	}

	public ExtendedIngredientsItem() {
	}

	protected ExtendedIngredientsItem(Parcel in) {
		this.image = in.readString();
		this.amount = in.readDouble();
		this.original = in.readString();
		this.consitency = in.readString();
		this.aisle = in.readString();
		this.originalName = in.readString();
		this.unit = in.readString();
		this.measures = in.readParcelable(Measures.class.getClassLoader());
		this.meta = new ArrayList<Object>();
		in.readList(this.meta, Object.class.getClassLoader());
		this.name = in.readString();
		this.originalString = in.readString();
		this.id = in.readInt();
		this.metaInformation = new ArrayList<Object>();
		in.readList(this.metaInformation, Object.class.getClassLoader());
	}

	public static final Parcelable.Creator<ExtendedIngredientsItem> CREATOR = new Parcelable.Creator<ExtendedIngredientsItem>() {
		@Override
		public ExtendedIngredientsItem createFromParcel(Parcel source) {
			return new ExtendedIngredientsItem(source);
		}

		@Override
		public ExtendedIngredientsItem[] newArray(int size) {
			return new ExtendedIngredientsItem[size];
		}
	};
}