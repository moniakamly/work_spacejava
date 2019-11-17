import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	// provide your ToDoList object
	// declare your ToDoList topic
	public static ArrayList<String> topicTodoLIst;

	public static void main(String[] args) {

		TodoList firstlist = new TodoList("My morning routine");

		// The run function will start the menu on the output screen
		run();
	}

	// create your run function with the following menu items
	private static void run() {

		boolean quit = false;
		String mainMenu = "" + "1. Add a topic\n" + "2. Select a topic\n" + "3. Assign Task\n" + "4. Assign deadline\n"
				+ "5. Create a task \n" + "6. Mark as done\n" + "7. Remove task \n" + "8. Rename task\n"
				+ "9. Display\n\n" + "10. Quit\n\n";
		while (!quit) {

			// The Scanner will input the user's choice
			Scanner input = new Scanner(System.in);
			System.out.println(mainMenu);
			int choice = input.nextInt();

			// you can add any conditional statement (if/else or switch)
			// each case, will run the function
			switch (choice) {
			case 1:
				addTopic();
				break;
			// create a case for each menu option

			default:
				System.out.println("Invalid entry try again");

			}
		}
		System.exit(0);

	}

	// implement the method for each case. I have provided example code
	// for the first option, addTopic.

	private static void addTopic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter topic name");
		String name = sc.nextLine();

		for (int i = 0; i < topicTodoLIst.size(); i++) {
			if (topicTodoLIst.get(i).topic.equals(name)) {
				System.out.println("Topic already exists. Try again");
				return;
			}
		}

		topicTodoLIst.add(new TodoList(name));
		System.out.println("Topic added successfully");

	}

}
