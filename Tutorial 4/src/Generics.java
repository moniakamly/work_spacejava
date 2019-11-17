import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}


public class Generics {

	public static void main(String[] args) {

			ArrayList<String> strings = new ArrayList<>();
			strings.add("Banana");
			strings.add("Kiwi");
			strings.add("Apple");
			
			String fruit=strings.get(0);
			System.out.println(fruit);
			
			
			/// there can be more than one argument /////
			//HashMap<Animal, String> map = new HashMap<>(); 
	}

}
