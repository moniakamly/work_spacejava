
class Frog {
	private String name; 
	int age;
	
	
	//////////// Setters and Getters 
	public void setName (String name) {
		this.name=name;
	}
	
	public void setAge (int age) {
		this.age =age;
	}
	
	
	public String getNAme () {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	


	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}

}


public class App {
	public static void main(String[] args) {
		Frog frog1 = new Frog ();
		frog1.setName("Adam"); 
		frog1.setAge (25);
		System.out.println(frog1.getAge());
	}

}
