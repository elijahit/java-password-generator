package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// GESTIAMO IL NOME 
		System.out.println("Ciao! Benvenuto nel generatore di password meno sicuro al mondo :C \n"
				+ "Adesso iniziamo con delle semplici domande: Qual'è il tuo nome?");
		String name = sc.nextLine();
		
		//GESTIAMO IL COGNOME
		System.out.println("Qual'è il tuo cognome?");
		String lastname = sc.nextLine();
		
		//GESTIAMO IL COLORE PREFERITO
		System.out.println("Qual'è il tuo colore preferito?");
		String favoriteColor = sc.nextLine();
		
		//GESTIAMO LA DATA DI NASCITA
		System.out.println("Inseriscimi ora il tuo giorno di nascita in numeri (ES: 26)");
		int bornDay = sc.nextInt();
		
		System.out.println("Inserisci ora il tuo mese di nascita in numeri (ES: 12)");
		int bornMonths = sc.nextInt();
		
		System.out.println("Inserisci ora il tuo anno di nascita in numeri (ES: 2002)");
		int bornYears = sc.nextInt();
		int resolveBorn = bornDay + bornMonths + bornYears;		
				
		//FINE DEL PROGRAMMA E OUTPUT FINITO
		System.out.println("La tua password estremamente insicura è: \n"
				+ name + "-"+ lastname + "-" + favoriteColor + "-" + resolveBorn);
		
	}
}
