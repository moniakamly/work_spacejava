class Frog {
	
	private String name;
	private int id;
	
	public Frog (String name, int id ) {
		this.name = name;
		this.id=id;
	}
	
	////Stringbuilder and to String /////////////////
	
	public String toString() {
		
		return String.format ("%s: %4d",name, id);
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(name).append( ": " ).append(id);
		
		return sb.toString();
			*/	
	}
}

public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog("Bob", 80);
		Frog frog2 = new Frog("John", 138);

		System.out.println(frog1);
		System.out.println(frog2);

		
	}

}
