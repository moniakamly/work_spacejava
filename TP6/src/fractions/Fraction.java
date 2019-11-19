package fractions;

public class Fraction {

	private int n; // le numérateur
	private int d; // le dénominateur

	/*
	 * Les constructeurs
	 */

	public Fraction() {
		this.n = 0;
		this.d = 1;
		// this(0,1);
	}

	public Fraction(int n) {
		this.n = n;
		this.d = 1;
		// this(n,1);
	}

	public Fraction(int n, int d) {
		this.n = n;
		this.d = d;
		// this(n,d);
	}

	public Fraction(String s) {
		this.n = Integer.parseInt(s.substring(0, s.indexOf("/")));
		this.d = Integer.parseInt(s.substring(s.indexOf("/") + 1, s.length()));
	}

	/*
	 * Les méthodes
	 */

	public String toString() {

		return (this.n + "/" + this.d);
	}

	public int getNumerateur() {
		return this.n;
	}

	public int getDenominateur() {
		return this.d;
	}

	public void setNumerateur(int n) {
		this.n = n;
	}

	public void setDenominateur(int d) {
		this.d = d;
	}

	public static Fraction valueOf(String s) {

		return new Fraction(s);
	}

	/*
	 * Méthode qui consiste à réduire la fraction
	 */

	public Fraction reduire(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fractionReduite = new Fraction();
		fractionReduite.n = f.n / a.pgcd(f.n, f.d);
		fractionReduite.d = f.d / a.pgcd(f.n, f.d);

		return (fractionReduite);
	}

	/*
	 * Retourne le résultat de l'addition de this et f
	 */

	public Fraction plus(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n = ((this.n * a.ppcm(this.d, f.d)) / this.d) + ((f.n * a.ppcm(this.d, f.d)) / f.d);
		fraction.d = a.ppcm(this.d, f.d);
		return fraction;
	}

	/*
	 * Retourne le résultat de la soustraction de this par f
	 */

	public Fraction moins(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n = ((this.n * a.ppcm(this.d, f.d)) / this.d) - ((f.n * a.ppcm(this.d, f.d)) / f.d);
		fraction.d = a.ppcm(this.d, f.d);
		return fraction;
	}

	/*
	 * Retourne le résultat de la multiplication de this par f
	 */

	public Fraction fois(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n = this.n * f.n;
		fraction.d = this.d * f.d;
		return fraction;
	}

	/*
	 * Retourne le résultat de la division de this par f
	 */
	public Fraction diviserPar(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n = this.n * f.d;
		fraction.d = this.d * f.n;
		return fraction;
	}

	/*
	 * Méthode pour comparer this avec f (retourne un int négatif si this est
	 * inférieur à f, positif si this est supérieur à f, nul si this est equivalent
	 * à f
	 */

	public int compareTo(Fraction f) {
		int resultat = 0;
		if (this.d == f.d) {
			if (this.n > f.n)
				resultat = 1;
			else
				resultat = -1;
		} else if (this.n == f.n) {
			if (this.d < f.n)
				resultat = 1;
			else
				resultat = -1;
		} else if (this.n != f.n) { // on les réduit au meme dénominateur

		}
		return resultat;
	}

	public static void main(String[] args) {
		Fraction f = new Fraction();
		// System.out.println(f.toString());
		Fraction f1 = new Fraction(12, 6);
		System.out.println(f.plus(f1).reduire(f1));
		//System.out.println(f.reduire(f));

	}

}
