//import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		int[] numbers = {4,3,100,158};
		int[][] tableau = {
				{2,5,6},
				{11,56,100},
				{56,88,45},
				};
		System.out.println(numbers [2]);
		System.out.println(tableau [2][0]);
		
		for (int i=0; i<numbers.length; i++ ) {
			System.out.print(numbers[i] + "\t" + "\n");
		}
		
		for (int row=0; row<tableau.length; row++) {
			for (int col=0; col<tableau[row].length; col++)
				System.out.print(tableau[row][col] + "\t");
		}
		
		
		
		/*Scanner input = new Scanner (System.in);
		System.out.println("Enter a line of text: ");
		
		String line= input.nextLine();
		System.out.println("You entered:  " + line);
		*/
	}

}
