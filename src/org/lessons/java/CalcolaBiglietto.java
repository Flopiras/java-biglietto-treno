package org.lessons.java;

//importo Scanner
import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		//apro lo Scanner
		Scanner in = new Scanner(System.in);
		
		//chiedo all'utente quanti chilometri intende fare
		System.out.println("Quanti chilometri si vogliono percorrere? (digitare la cifra)");
		String strKilometers = in.nextLine();
		int intKilometers = Integer.valueOf(strKilometers);
		
		//chiedo all'utente quanti anni ha il passeggero
			System.out.println("Quanti anni ha il passeggero? (digitare la cifra)");
			String strAge = in.nextLine();
			int intAge = Integer.valueOf(strAge);
			
		//chiudo lo scanner
			in.close();
		
		
		//calcolo il prezzo del biglietto e applico sconti SE neecessari
		double price = intKilometers * 0.21;
			
		if(intAge < 18) {
			price *= 0.8;
			
		}else if(intAge > 65) {
			price *= 0.6;
		}
		
		
		System.out.println("Il prezzo del biglietto è pari a € " + price);
		
		
	}
}
