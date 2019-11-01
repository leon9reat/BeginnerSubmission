package com.medialink.beginsubmission1.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RecipesItem implements Parcelable {

	@SerializedName("instructions")
	private String instructions;

	@SerializedName("sustainable")
	private boolean sustainable;

	@SerializedName("analyzedInstructions")
	private List<AnalyzedInstructionsItem> analyzedInstructions;

	@SerializedName("glutenFree")
	private boolean glutenFree;

	@SerializedName("veryPopular")
	private boolean veryPopular;

	@SerializedName("healthScore")
	private double healthScore;

	@SerializedName("title")
	private String title;

	@SerializedName("diets")
	private List<String> diets;

	@SerializedName("aggregateLikes")
	private int aggregateLikes;

	@SerializedName("sourceUrl")
	private String sourceUrl;

	@SerializedName("creditsText")
	private String creditsText;

	@SerializedName("readyInMinutes")
	private int readyInMinutes;

	@SerializedName("dairyFree")
	private boolean dairyFree;

	@SerializedName("servings")
	private int servings;

	@SerializedName("vegetarian")
	private boolean vegetarian;

	@SerializedName("whole30")
	private boolean whole30;

	@SerializedName("id")
	private int id;

	@SerializedName("imageType")
	private String imageType;

	@SerializedName("winePairing")
	private WinePairing winePairing;

	@SerializedName("image")
	private String image;

	@SerializedName("veryHealthy")
	private boolean veryHealthy;

	@SerializedName("vegan")
	private boolean vegan;

	@SerializedName("cheap")
	private boolean cheap;

	@SerializedName("extendedIngredients")
	private List<ExtendedIngredientsItem> extendedIngredients;

	@SerializedName("dishTypes")
	private List<String> dishTypes;

	@SerializedName("gaps")
	private String gaps;

	@SerializedName("cuisines")
	private List<Object> cuisines;

	@SerializedName("lowFodmap")
	private boolean lowFodmap;

	@SerializedName("weightWatcherSmartPoints")
	private int weightWatcherSmartPoints;

	@SerializedName("occasions")
	private List<String> occasions;

	@SerializedName("spoonacularScore")
	private double spoonacularScore;

	@SerializedName("pricePerServing")
	private double pricePerServing;

	@SerializedName("spoonacularSourceUrl")
	private String spoonacularSourceUrl;

	@SerializedName("sourceName")
	private String sourceName;

	@SerializedName("ketogenic")
	private boolean ketogenic;

	@SerializedName("preparationMinutes")
	private int preparationMinutes;

	@SerializedName("cookingMinutes")
	private int cookingMinutes;

	public void setInstructions(String instructions){
		this.instructions = instructions;
	}

	public String getInstructions(){
		return instructions;
	}

	public void setSustainable(boolean sustainable){
		this.sustainable = sustainable;
	}

	public boolean isSustainable(){
		return sustainable;
	}

	public void setAnalyzedInstructions(List<AnalyzedInstructionsItem> analyzedInstructions){
		this.analyzedInstructions = analyzedInstructions;
	}

	public List<AnalyzedInstructionsItem> getAnalyzedInstructions(){
		return analyzedInstructions;
	}

	public void setGlutenFree(boolean glutenFree){
		this.glutenFree = glutenFree;
	}

	public boolean isGlutenFree(){
		return glutenFree;
	}

	public void setVeryPopular(boolean veryPopular){
		this.veryPopular = veryPopular;
	}

	public boolean isVeryPopular(){
		return veryPopular;
	}

	public void setHealthScore(double healthScore){
		this.healthScore = healthScore;
	}

	public double getHealthScore(){
		return healthScore;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDiets(List<String> diets){
		this.diets = diets;
	}

	public List<String> getDiets(){
		return diets;
	}

	public void setAggregateLikes(int aggregateLikes){
		this.aggregateLikes = aggregateLikes;
	}

	public int getAggregateLikes(){
		return aggregateLikes;
	}

	public void setSourceUrl(String sourceUrl){
		this.sourceUrl = sourceUrl;
	}

	public String getSourceUrl(){
		return sourceUrl;
	}

	public void setCreditsText(String creditsText){
		this.creditsText = creditsText;
	}

	public String getCreditsText(){
		return creditsText;
	}

	public void setReadyInMinutes(int readyInMinutes){
		this.readyInMinutes = readyInMinutes;
	}

	public int getReadyInMinutes(){
		return readyInMinutes;
	}

	public void setDairyFree(boolean dairyFree){
		this.dairyFree = dairyFree;
	}

	public boolean isDairyFree(){
		return dairyFree;
	}

	public void setServings(int servings){
		this.servings = servings;
	}

	public int getServings(){
		return servings;
	}

	public void setVegetarian(boolean vegetarian){
		this.vegetarian = vegetarian;
	}

	public boolean isVegetarian(){
		return vegetarian;
	}

	public void setWhole30(boolean whole30){
		this.whole30 = whole30;
	}

	public boolean isWhole30(){
		return whole30;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setImageType(String imageType){
		this.imageType = imageType;
	}

	public String getImageType(){
		return imageType;
	}

	public void setWinePairing(WinePairing winePairing){
		this.winePairing = winePairing;
	}

	public WinePairing getWinePairing(){
		return winePairing;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setVeryHealthy(boolean veryHealthy){
		this.veryHealthy = veryHealthy;
	}

	public boolean isVeryHealthy(){
		return veryHealthy;
	}

	public void setVegan(boolean vegan){
		this.vegan = vegan;
	}

	public boolean isVegan(){
		return vegan;
	}

	public void setCheap(boolean cheap){
		this.cheap = cheap;
	}

	public boolean isCheap(){
		return cheap;
	}

	public void setExtendedIngredients(List<ExtendedIngredientsItem> extendedIngredients){
		this.extendedIngredients = extendedIngredients;
	}

	public List<ExtendedIngredientsItem> getExtendedIngredients(){
		return extendedIngredients;
	}

	public void setDishTypes(List<String> dishTypes){
		this.dishTypes = dishTypes;
	}

	public List<String> getDishTypes(){
		return dishTypes;
	}

	public void setGaps(String gaps){
		this.gaps = gaps;
	}

	public String getGaps(){
		return gaps;
	}

	public void setCuisines(List<Object> cuisines){
		this.cuisines = cuisines;
	}

	public List<Object> getCuisines(){
		return cuisines;
	}

	public void setLowFodmap(boolean lowFodmap){
		this.lowFodmap = lowFodmap;
	}

	public boolean isLowFodmap(){
		return lowFodmap;
	}

	public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints){
		this.weightWatcherSmartPoints = weightWatcherSmartPoints;
	}

	public int getWeightWatcherSmartPoints(){
		return weightWatcherSmartPoints;
	}

	public void setOccasions(List<String> occasions){
		this.occasions = occasions;
	}

	public List<String> getOccasions(){
		return occasions;
	}

	public void setSpoonacularScore(double spoonacularScore){
		this.spoonacularScore = spoonacularScore;
	}

	public double getSpoonacularScore(){
		return spoonacularScore;
	}

	public void setPricePerServing(double pricePerServing){
		this.pricePerServing = pricePerServing;
	}

	public double getPricePerServing(){
		return pricePerServing;
	}

	public void setSpoonacularSourceUrl(String spoonacularSourceUrl){
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	public String getSpoonacularSourceUrl(){
		return spoonacularSourceUrl;
	}

	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}

	public String getSourceName(){
		return sourceName;
	}

	public void setKetogenic(boolean ketogenic){
		this.ketogenic = ketogenic;
	}

	public boolean isKetogenic(){
		return ketogenic;
	}

	public void setPreparationMinutes(int preparationMinutes){
		this.preparationMinutes = preparationMinutes;
	}

	public int getPreparationMinutes(){
		return preparationMinutes;
	}

	public void setCookingMinutes(int cookingMinutes){
		this.cookingMinutes = cookingMinutes;
	}

	public int getCookingMinutes(){
		return cookingMinutes;
	}

	@Override
 	public String toString(){
		return 
			"RecipesItem{" + 
			"instructions = '" + instructions + '\'' + 
			",sustainable = '" + sustainable + '\'' + 
			",analyzedInstructions = '" + analyzedInstructions + '\'' + 
			",glutenFree = '" + glutenFree + '\'' + 
			",veryPopular = '" + veryPopular + '\'' + 
			",healthScore = '" + healthScore + '\'' + 
			",title = '" + title + '\'' + 
			",diets = '" + diets + '\'' + 
			",aggregateLikes = '" + aggregateLikes + '\'' + 
			",sourceUrl = '" + sourceUrl + '\'' + 
			",creditsText = '" + creditsText + '\'' + 
			",readyInMinutes = '" + readyInMinutes + '\'' + 
			",dairyFree = '" + dairyFree + '\'' + 
			",servings = '" + servings + '\'' + 
			",vegetarian = '" + vegetarian + '\'' + 
			",whole30 = '" + whole30 + '\'' + 
			",id = '" + id + '\'' + 
			",imageType = '" + imageType + '\'' + 
			",winePairing = '" + winePairing + '\'' + 
			",image = '" + image + '\'' + 
			",veryHealthy = '" + veryHealthy + '\'' + 
			",vegan = '" + vegan + '\'' + 
			",cheap = '" + cheap + '\'' + 
			",extendedIngredients = '" + extendedIngredients + '\'' + 
			",dishTypes = '" + dishTypes + '\'' + 
			",gaps = '" + gaps + '\'' + 
			",cuisines = '" + cuisines + '\'' + 
			",lowFodmap = '" + lowFodmap + '\'' + 
			",weightWatcherSmartPoints = '" + weightWatcherSmartPoints + '\'' + 
			",occasions = '" + occasions + '\'' + 
			",spoonacularScore = '" + spoonacularScore + '\'' + 
			",pricePerServing = '" + pricePerServing + '\'' + 
			",spoonacularSourceUrl = '" + spoonacularSourceUrl + '\'' + 
			",sourceName = '" + sourceName + '\'' + 
			",ketogenic = '" + ketogenic + '\'' + 
			",preparationMinutes = '" + preparationMinutes + '\'' + 
			",cookingMinutes = '" + cookingMinutes + '\'' + 
			"}";
		}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.instructions);
        dest.writeByte(this.sustainable ? (byte) 1 : (byte) 0);
        dest.writeList(this.analyzedInstructions);
        dest.writeByte(this.glutenFree ? (byte) 1 : (byte) 0);
        dest.writeByte(this.veryPopular ? (byte) 1 : (byte) 0);
        dest.writeDouble(this.healthScore);
        dest.writeString(this.title);
        dest.writeStringList(this.diets);
        dest.writeInt(this.aggregateLikes);
        dest.writeString(this.sourceUrl);
        dest.writeString(this.creditsText);
        dest.writeInt(this.readyInMinutes);
        dest.writeByte(this.dairyFree ? (byte) 1 : (byte) 0);
        dest.writeInt(this.servings);
        dest.writeByte(this.vegetarian ? (byte) 1 : (byte) 0);
        dest.writeByte(this.whole30 ? (byte) 1 : (byte) 0);
        dest.writeInt(this.id);
        dest.writeString(this.imageType);
        dest.writeParcelable(this.winePairing, flags);
        dest.writeString(this.image);
        dest.writeByte(this.veryHealthy ? (byte) 1 : (byte) 0);
        dest.writeByte(this.vegan ? (byte) 1 : (byte) 0);
        dest.writeByte(this.cheap ? (byte) 1 : (byte) 0);
        dest.writeList(this.extendedIngredients);
        dest.writeStringList(this.dishTypes);
        dest.writeString(this.gaps);
        dest.writeList(this.cuisines);
        dest.writeByte(this.lowFodmap ? (byte) 1 : (byte) 0);
        dest.writeInt(this.weightWatcherSmartPoints);
        dest.writeStringList(this.occasions);
        dest.writeDouble(this.spoonacularScore);
        dest.writeDouble(this.pricePerServing);
        dest.writeString(this.spoonacularSourceUrl);
        dest.writeString(this.sourceName);
        dest.writeByte(this.ketogenic ? (byte) 1 : (byte) 0);
        dest.writeInt(this.preparationMinutes);
        dest.writeInt(this.cookingMinutes);
    }

    public RecipesItem() {
    }

    protected RecipesItem(Parcel in) {
        this.instructions = in.readString();
        this.sustainable = in.readByte() != 0;
        this.analyzedInstructions = new ArrayList<AnalyzedInstructionsItem>();
        in.readList(this.analyzedInstructions, AnalyzedInstructionsItem.class.getClassLoader());
        this.glutenFree = in.readByte() != 0;
        this.veryPopular = in.readByte() != 0;
        this.healthScore = in.readDouble();
        this.title = in.readString();
        this.diets = in.createStringArrayList();
        this.aggregateLikes = in.readInt();
        this.sourceUrl = in.readString();
        this.creditsText = in.readString();
        this.readyInMinutes = in.readInt();
        this.dairyFree = in.readByte() != 0;
        this.servings = in.readInt();
        this.vegetarian = in.readByte() != 0;
        this.whole30 = in.readByte() != 0;
        this.id = in.readInt();
        this.imageType = in.readString();
        this.winePairing = in.readParcelable(WinePairing.class.getClassLoader());
        this.image = in.readString();
        this.veryHealthy = in.readByte() != 0;
        this.vegan = in.readByte() != 0;
        this.cheap = in.readByte() != 0;
        this.extendedIngredients = new ArrayList<ExtendedIngredientsItem>();
        in.readList(this.extendedIngredients, ExtendedIngredientsItem.class.getClassLoader());
        this.dishTypes = in.createStringArrayList();
        this.gaps = in.readString();
        this.cuisines = new ArrayList<Object>();
        in.readList(this.cuisines, Object.class.getClassLoader());
        this.lowFodmap = in.readByte() != 0;
        this.weightWatcherSmartPoints = in.readInt();
        this.occasions = in.createStringArrayList();
        this.spoonacularScore = in.readDouble();
        this.pricePerServing = in.readDouble();
        this.spoonacularSourceUrl = in.readString();
        this.sourceName = in.readString();
        this.ketogenic = in.readByte() != 0;
        this.preparationMinutes = in.readInt();
        this.cookingMinutes = in.readInt();
    }

    public static final Parcelable.Creator<RecipesItem> CREATOR = new Parcelable.Creator<RecipesItem>() {
        @Override
        public RecipesItem createFromParcel(Parcel source) {
            return new RecipesItem(source);
        }

        @Override
        public RecipesItem[] newArray(int size) {
            return new RecipesItem[size];
        }
    };
}