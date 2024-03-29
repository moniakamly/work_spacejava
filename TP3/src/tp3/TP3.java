
package tp3;

import java.util.Scanner;

public class TP3 {

	public static void main(String[] args) {
		exercicetest();
		// exercice();
		// exercicet1();
		// exercicet2();
		// exercicett1();

		// exercice1();
		// exercice1prime();
		// exercice2();
		// exercice2prime();
		// exercice3();
		// exercice3prime();
		// exercice4();
		//exercice4prime();
		// exercice5();
		// exercice6();

	}
	public static void exercicetest() {
		int i=021;
		 //i=i/2*2;
		 i=i*2/2;
		System.out.print(i);		
	}

	public static void exercice() {
		int somme = 0, moyenne = 1, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une note");
		int x = sc.nextInt();
		while (x != -1) {
			somme = somme + x;
			System.out.println("Entrez une note");
			x = sc.nextInt();
			i++;
			System.out.println(i);
		}
		moyenne = somme / (i);

		System.out.println("la somme des notes est " + somme);
		System.out.println("La moyenne des notes est " + moyenne);
	}

	/**
	 * V�rifie si les �lements d'un tableau sont dans l'ordre croissant
	 */
	public static void exercicet1() {
		int[] t = { 3, 2, 4, 6, 7 };

		int i = 0;
		boolean trie = true;

		while (i < t.length - 1 && trie) {
			if (t[i] > t[i + 1]) {
				trie = false;
				System.out.println("Les �lements du tableau ne sont pas dans l'ordre croissant");
			}
			i++;
		}
		if (trie) {
			System.out.println("Les �lements du tableau sont dans l'ordre croissant");
		}
	}

	public static void exercicet2() {
		boolean equal = true;
		int[] t = { 1, 1, 1, 11 };
		for (int i = 1; i < (t.length); i++) {
			System.out.println(t[i]);
			if (t[0] != t[i]) {
				equal = false;
				break;
			}
		}
		System.out.println(equal);
	}

	public static void exercicett1() {
		int[][] tableau1 = new int[3][4];
		int[][] tableau2 = { { 1, 2, 3 }, { 5, 6, 7 } };
		System.out.println(tableau2[1][1]);

	}

	/**
	 * Afficher une chaine de caract�res � l'envers
	 */
	public static void exercice1() {
		String mot, motInverse = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un mot");
		mot = sc.nextLine();
		System.out.println(mot.length());
		for (int j = mot.length() - 1; j >= 0; j--) {
			motInverse = motInverse + mot.charAt(j);
		}
		System.out.println(motInverse);
		sc.close();
	}

	/**
	 * 
	 */

	public static void exercice1prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Taper une chaie : ");
		String s = sc.next();
		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));

	}

	/**
	 * Calcul d'un nombre binaire dans une chaine de caract�res en sa valeur
	 * d�cimale
	 */
	public static void exercice2() {
		String mot, motFinale = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caract�res contenant un nombre entier en notation binaire");
		mot = sc.nextLine();
		for (int i = 0; i < mot.length(); i++) {
			if (mot.charAt(i) == '0' || mot.charAt(i) == '1') {
				motFinale = motFinale + mot.charAt(i);
			}
		}
		System.out.println(motFinale);
		System.out.println(Integer.valueOf(motFinale));
		int nombreBinaire = Integer.valueOf(motFinale);
		int k = 0, resultat = 0;
		int reste;

		for (int j = 0; j < motFinale.length(); j++) {
			reste = nombreBinaire % 10;
			resultat = resultat + reste * (int) Math.pow(2, k);
			// System.out.println("reste = " + reste);
			k++;
			nombreBinaire = nombreBinaire / 10;
			// System.out.println(k);
		}
		System.out.println(resultat);
	}

	/**
	 * nombre bnaire en d�cimal
	 */
	public static void exercice2prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Taper une chaine");
		String s = sc.next();
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			res = res * 2;
			if (s.charAt(i) == '1')
				res = res + 1;
		}
		System.out.println("La valeur d�cimale est " + res);
	}

	/**
	 * Changer les lettres miniscules en Majuscules dans une chaine de caract�res
	 */

	public static void exercice3() {
		String mot, motMajuscule;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caract�res");
		mot = sc.nextLine();
		motMajuscule = mot.toUpperCase();
		System.out.println(motMajuscule);
		sc.close();
	}

	/**
	 * Transformer les miniscules en majuscules sans utiliser toUpperCase()
	 */

	public static void exercice3prime() {
		String mot, motMajuscule = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caract�res");
		mot = sc.nextLine();
		for (int i = 0; i < mot.length(); i++) {
			motMajuscule = motMajuscule + (char) ((int) mot.charAt(i) - 'a' + 'A');
		}
		System.out.println(motMajuscule);

	}

	/**
	 * Alternance de Majuscules et miniscules dans une chaine de caract�res
	 */
	public static void exercice4() {
		String mot, result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caract�res");
		mot = sc.nextLine();

		for (int i = 0; i < mot.length(); i += 2) {
			result = result + mot.toUpperCase().charAt(i);
			if (i + 1 < mot.length()) {
				result = result + mot.toLowerCase().charAt(i + 1);
			}
		}
		System.out.println(result);

		sc.close();
	}

	/**
	 * Alternance de majuscules et de miniscules
	 */
	public static void exercice4prime() {
		String mot, result = "";
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caract�res");
		mot = sc.nextLine();

		for (int i = 0; i < mot.length(); i += 2) {
			c = mot.charAt(i);
			result += (char) (c - 'a' + 'A');

			if (i + 1 < mot.length())
				result += (char) (mot.charAt(i+1) - 'A' + 'a');
		}
		System.out.println(result);
		sc.close();

	}

	/**
	 * Calcul du nombre d'occurences du caract�res dans la chaine de caract�re
	 */

	public static void exercice5() {
		char car;
		String mot;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un caract�re");
		car = sc.nextLine().charAt(0);
		System.out.println("Entrer une chaine de caract�re");
		mot = sc.nextLine();
		for (int i = 0; i < mot.length(); i++) {
			if (mot.charAt(i) == car) {
				k++;
			}
		}
		System.out.println("Le nombre d'occurences de " + car + " dans " + mot + " est " + k);
	}

	/**
	 * Afficher une chaine de caract�res lue apr�s avoir ot� de la chaine toutes les
	 * occurences du caract�re c
	 */

	public static void exercice6() {
		char car;
		String mot, motfinale = "";
		// int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un caract�re");
		car = sc.nextLine().charAt(0);
		System.out.println("Entrer une chaine de caract�re");
		mot = sc.nextLine();
		for (int i = 0; i < mot.length(); i++) {
			if (mot.charAt(i) != car) {
				// k++;
				motfinale = motfinale + mot.charAt(i);
			}
		}
		System.out.println(motfinale);
	}

}
