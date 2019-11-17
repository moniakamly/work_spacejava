import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//// A program reading files using Scanner
public class Read {
	public static void main(String[] args) throws FileNotFoundException {

		///String fileName = "C:\\Users\\monia\\Desktop\\example.txt";
		String fileName = "example.txt";

		File textFile = new File(fileName);

		Scanner sc = new Scanner(textFile);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);

		}
		sc.close();

	}
}
