package com.medialink.beginsubmission1.model;

import com.google.gson.annotations.SerializedName;

public class ProductMatchesItem{

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
}