package org.lessons.java.security;

public class Persona {
	private String name, lastname, favoriteColor;
	private int dayBorn, monthBorn, yearBorn;
	
	Persona(String name, String lastname, String favoriteColor, int dayBorn, int monthBorn, int yearBorn) {
		this.name = name;
		this.lastname = lastname;
		this.favoriteColor = favoriteColor;
		this.dayBorn = dayBorn;
		this.monthBorn = monthBorn;
		this.yearBorn = yearBorn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getfavoriteColor() {
		return favoriteColor;
	}
	
	public int getDayBorn() {
		return dayBorn;
	}
	
	public int getMonthBorn() {
		return monthBorn;
	}
	
	public int getYearBorn() {
		return yearBorn;
	}
	
	@Override 
	public String toString() {
		return "Name: " + name + "\nLastname: " + lastname + "\nFavoriteColor: " + favoriteColor 
				+ "\nDayBorn: " + dayBorn + "\nMonthBorn: " + monthBorn + "\nYearBorn: " + yearBorn;
	}
}
