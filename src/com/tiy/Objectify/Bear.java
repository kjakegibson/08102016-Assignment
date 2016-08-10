package com.tiy.Objectify;

public class Bear extends StuffedAnimal{
	
	public String name = null;
	public String whatFood = null;
	public String color = null;
	public int children = 0;
	public int weight = 0;
	public String skeletonMaterial = null;
	public int howMuchTungsten = 0;
	public int howManyLimbs = 0;
	public String endTime = null;
	public String cuddleFactor = null;
	
	public Bear(String name, String whatFood, String color, int children, int weight, String skeletonMaterial,
			int howMuchTungsten, int howManyLimbs, String endTime, String cuddleFactor) {
		this.name = name;
		this.whatFood = whatFood;
		this.color = color;
		this.children = children;
		this.weight = weight;
		this.skeletonMaterial = skeletonMaterial;
		this.howMuchTungsten = howMuchTungsten;
		this.howManyLimbs = howManyLimbs;
		this.endTime = endTime;
		this.cuddleFactor = cuddleFactor;
		
		
	}

	public Bear() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhatFood() {
		return whatFood;
	}

	public void setWhatFood(String whatFood) {
		this.whatFood = whatFood;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSkeletonMaterial() {
		return skeletonMaterial;
	}

	public void setSkeletonMaterial(String skeletonMaterial) {
		this.skeletonMaterial = skeletonMaterial;
	}

	public int getHowMuchTungsten() {
		return howMuchTungsten;
	}

	public void setHowMuchTungsten(int howMuchTungsten) {
		this.howMuchTungsten = howMuchTungsten;
	}

	public int getHowManyLimbs() {
		return howManyLimbs;
	}

	public void setHowManyLimbs(int howManyLimbs) {
		this.howManyLimbs = howManyLimbs;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCuddleFactor() {
		return cuddleFactor;
	}

	public void setCuddleFactor(String cuddleFactor) {
		this.cuddleFactor = cuddleFactor;
	}

	@Override
	public void loves() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cuddles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "So, it sounds like your after a stuffed " + name + " with " + howManyLimbs + " various limbs. Looks like you'd like it to be colored " + color + 
				"\n and weigh approximately " + weight + " metric tons. The skeleton will be entirely crafted from the finest of " + skeletonMaterial + " and " +
				"\nthe claws should contain roughly " + howMuchTungsten + "grams of sweet, sweet tungsten. The cuddle factor is going to top off at around " + cuddleFactor +
				"\nand it's not going to be able to digest anything other than " + whatFood + ". Somewhere during it's lifespan it should spit out around " + children + " smaller" +
				"\nn versions of itself to simulate some kind of hellish reality or something. Oh, and if it ever starts repeating...  " +
				"\n''" + endTime + "''" +
				"\n You need to get your ass to high ground. Enjoy.";

	}

	
	
	
	
	
}
	
