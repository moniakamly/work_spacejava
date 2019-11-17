package tp4;

import java.util.Arrays;


public class TP4 {

	public static void main(String[] args) {
		int[] [] tab2 = { {40, 20, 30, 20, 1} , {2,4,6} };
		//int[] tab = nouveauTab(10, -10, 22);
		//System.out.println(tabEnChaine(tab2));
		 changerValeurs(tab2, 5);
		 System.out.println(Arrays.toString(tab2));
		// System.out.println(tabEnChaine(tab));
		// incrValeurs(tab);
		// System.out.println(tabEnChaine(tab));
		// System.out.println(sommeValeurs(tab));
		//System.out.println("le pourcentage des nombres pairs dans le tableau est " + ratioPairs(tab2) + " %");
		//System.out.println("la valeur max  du tableau est " + maxValue(tab2));
		//System.out.println(appartient(2, tab2));
		//System.out.println(estTrie(tab2));
		//System.out.println(tousEgaux(tab2));
		//inverse(tab2);
		//System.out.println(tabEnChaine(tab2));
	}

	public static int[] nouveauTab(int taille, int vMin, int vMax) {
		int[] tab = new int[taille];
		int lg = vMax - vMin + 1;
		for (int i = 0; i < taille; i++) {
			tab[i] = (int) (Math.random() * lg + vMin);
		}
		return tab;
	}

	public static String tabEnChaine(int[] t) {
		if (t.length == 0)
			return "[]";
		String res = "[" + t[0];
		for (int i = 1; i < t.length; i++) {
			res += ", " + t[i];
		}
		return res + "]";
	}

	public static void changerValeurs(int[][] t, int val) {
		for (int i = 0; i < t.length; i++) {
			t[i][i] = val;
		}
	}

	public static void incrValeurs(int[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i]++;
		}
	}

	public static int sommeValeurs(int[] t) {
		int somme = 0;
		for (int i = 0; i < t.length; i++) {
			somme += t[i];
		}

		return somme;
	}

	public static double ratioPairs(int[] t) {
		double pourcentagePairs = 0;
		for (int i = 0; i < t.length; i++) {
			if ((t[i] % 2) == 0) {
				pourcentagePairs++;
			}
		}
		pourcentagePairs = (pourcentagePairs / t.length) * 100;
		return pourcentagePairs;
	}

	public static int maxValue(int[] tab) {
		int max = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max)
				max = tab[i];
		}

		return max;
	}

	public static boolean appartient(int val, int[] tab) {
		boolean appar = false;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == val) {
				appar = true;
				i++;
			}
		}
		return (appar);
	}

	public static boolean estTrie(int[] tab) {
		boolean tabTrier = true;
		for (int i = 0; i < tab.length - 1; i++) {
			if (tab[i] > tab[i + 1]) {
				tabTrier = false;
			}
		}
		return tabTrier;
	}

	public static boolean tousEgaux(int[] tab) {
		boolean egaux = true;

		for (int i = 0; i < tab.length - 1; i++) {
			if (tab[i] != tab[i + 1]) {
				egaux = false;
			}
		}
		return (egaux);
	}

	public static void inverse(int[] tab) {
		int[] tabResultat = new int[tab.length];
		int i = 0;
		for (int k = tab.length - 1; k >= 0; k--) {
			// System.out.println(i);
			tabResultat[i] = tab[k];
			i++;
		}
		for (int k = 0; k < tab.length; k++) {
			tab[k] = tabResultat[k];
		}
	}
	
	
	

	
}
