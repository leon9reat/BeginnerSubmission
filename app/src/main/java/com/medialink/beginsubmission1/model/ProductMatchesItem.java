package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ProductMatchesItem implements Parcelable {

	@SerializedName("score")
	private double score;

	@SerializedName("price")
	private String price;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("averageRating")
	private double averageRating;

	@SerializedName("link")
	private String link;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("ratingCount")
	private double ratingCount;

	public void setScore(double score){
		this.score = score;
	}

	public double getScore(){
		return score;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setAverageRating(double averageRating){
		this.averageRating = averageRating;
	}

	public double getAverageRating(){
		return averageRating;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setRatingCount(double ratingCount){
		this.ratingCount = ratingCount;
	}

	public double getRatingCount(){
		return ratingCount;
	}

	@Override
 	public String toString(){
		return 
			"ProductMatchesItem{" + 
			"score = '" + score + '\'' + 
			",price = '" + price + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",averageRating = '" + averageRating + '\'' + 
			",link = '" + link + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",ratingCount = '" + ratingCount + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeDouble(this.score);
		dest.writeString(this.price);
		dest.writeString(this.imageUrl);
		dest.writeDouble(this.averageRating);
		dest.writeString(this.link);
		dest.writeString(this.description);
		dest.writeInt(this.id);
		dest.writeString(this.title);
		dest.writeDouble(this.ratingCount);
	}

	public ProductMatchesItem() {
	}

	protected ProductMatchesItem(Parcel in) {
		this.score = in.readDouble();
		this.price = in.readString();
		this.imageUrl = in.readString();
		this.averageRating = in.readDouble();
		this.link = in.readString();
		this.description = in.readString();
		this.id = in.readInt();
		this.title = in.readString();
		this.ratingCount = in.readDouble();
	}

	public static final Parcelable.Creator<ProductMatchesItem> CREATOR = new Parcelable.Creator<ProductMatchesItem>() {
		@Override
		public ProductMatchesItem createFromParcel(Parcel source) {
			return new ProductMatchesItem(source);
		}

		@Override
		public ProductMatchesItem[] newArray(int size) {
			return new ProductMatchesItem[size];
		}
	};
}