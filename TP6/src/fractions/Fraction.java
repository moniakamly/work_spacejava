package fractions;

public class Fraction {
	
	private int n; // le num�rateur
	private int d; // le d�nominateur
	
	
	/*
	 * Les constructeurs 
	 */

	public Fraction() {
		this.n=0;
		this.d=1;
	}
	
	public Fraction(int n) {
		this.n=n;
		this.d=1;
	}
	
	public Fraction(int n, int d) {
		this.n=n; 
		this.d=d; 
	}
	
	public Fraction(String s) {
		this.n =Integer.parseInt(s.substring(0, s.indexOf("/")));
		this.d =Integer.parseInt(s.substring(s.indexOf("/")+1,s.length()));
	}
	
	/*
	 * Les m�thodes
	 */
	
	public String toString() {
	
		return (this.n+"/"+this.d); 
	}
	
	public int getNominateur() {
		return this.n; 
	}
	
	public int getDenominateur() {
		return this.d; 
	}
	
	public void setNominateur(int n) {
		this.n = n;
	}
	
	public void setDenominateur(int d) {
		this.d = d;
	}
	
	public static Fraction valueOf(String s) {
		
		return new Fraction(s); 
	}
	
	public Fraction plus(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n=((this.n*a.ppcm(this.d, f.d))/this.d) + ((f.n*a.ppcm(this.d, f.d))/f.d);
		fraction.d=a.ppcm(this.d, f.d);
		return fraction;
	}
	
	public Fraction moins(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n=((this.n*a.ppcm(this.d, f.d))/this.d) - ((f.n*a.ppcm(this.d, f.d))/f.d);
		fraction.d=a.ppcm(this.d, f.d);
		return fraction;
	}
	
	
	public Fraction fois(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n = this.n * f.n; 
		fraction.d = this.d * f.d; 
		return fraction; 
	}
	
	public Fraction diviserPar(Fraction f) {
		Arithmetique a = new Arithmetique();
		Fraction fraction = new Fraction();
		fraction.n = this.n * f.d; 
		fraction.d = this.d * f.n; 
		return fraction; 
	}
	
	

	
	
	public static void main(String[] args) {
		Fraction f = new Fraction("7/3");
		System.out.println(f.toString());
		Fraction f1 = new Fraction(7,2);
		System.out.println(f.diviserPar(f1));
		
	
	}

}