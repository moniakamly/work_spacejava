package projet1;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {

		
		int x,y,resultat;
		String Celcius, Fehrenheit;
		char reponse = 'C';
		Scanner sc = new Scanner (System.in);
		while (reponse == 'C') {
			System.out.println("Veuillez saisir un nombre pour convertir");
			x = sc.nextInt();
			System.out.println("Veuillez choisir un mode de conversion\n 1- Celcuis vers ferhe\n 2- Ferh vers Celcius");
			y = sc.nextInt();
		if (y==1) {
		 resultat = 9/5 * (x + 32);
		System.out.println("La conversion de " + x + " de Celcuis en Ferh est " + resultat);
		}
		else if (y==2) {
		 resultat = ((x-32)*5)/9;
		 System.out.println("La conversion de " + x + " de Ferh en Celcius est " + resultat);
		}
		}
		

	}
}