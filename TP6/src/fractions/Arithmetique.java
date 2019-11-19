package fractions;

public class Arithmetique {

	private int a;
	private int b;

	public int pgcd(int a, int b) {
		int r = a % b;

		if (r == 0)
			return b;
		else 
			return (pgcd(b, r));
	}

	
	  //int t,r; if (b>a) { t = a; a = b; b = t; } do { r = a % b; a = b; b = r; }
	  //while(r !=0); return a ; }
	 

	public int ppcm(int a, int b) {
		return a / pgcd(a, b) * b;
	}

}
