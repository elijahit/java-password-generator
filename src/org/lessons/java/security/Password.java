package org.lessons.java.security;

public class Password {
	public String Generator(Persona persona) {
		int resolveBorn = persona.getDayBorn() + persona.getMonthBorn() + persona.getYearBorn();		
		return "" + persona.getName() + "-"+ persona.getLastname() + "-" + persona.getfavoriteColor() + "-" + resolveBorn;
	}
}
