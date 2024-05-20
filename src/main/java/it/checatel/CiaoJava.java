package it.checatel;

import java.util.Scanner;

public class CiaoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Caio Java!");
		System.out.println("Hello World!");
		
		//dati primitivi in java
		
		int mioIntero = 2147483647;
		long mioLong = 9223372036854775807L;
		float mioFloat = 5.5F;
		byte mioByte = -10;
		short mioShort = 32000;
		double mioDouble = 123124132.2131231231D;
		char mioChar = 'C';
		boolean mioBoolean = true;
		
		//dati non primitivi
		String variabileStringa = "Ciao io sono una stringa";
		System.out.println(variabileStringa);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		
		//la variabile riceve il valore del input con il met
		String nome = input.nextLine();
		//per leggere una stringa si usa il metodo nextLine
		System.out.println(nome);
						
		System.out.println("Inserisci la tua eta");
		//per leggere una stringa si usa il metodo nextInt
		int eta = input.nextInt();
		System.out.println("Tipi di dati primitivi \n" + "\n Intero \n" + mioIntero + "\n Long \n" + mioLong + "\n Float \n" + mioFloat + "\n Byte \n" + mioByte + "\n Short \n" + mioShort + "\n Double \n" + mioDouble + "\n Boolean \n" + mioBoolean);
		
	}

}
