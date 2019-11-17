//remember to import the ToDoList class


public class Test {
public static void main(String[] args) {
		Test t = new Test();

		//this calls a method that runs all of the tests you will implement
		t.testAll();
	}

	//Here is an example of the test for adding a task.  
	private void testCreateTask() {

		System.out.println("Adding elements to the list");
		ToDoList.createTask("String 1");
		ToDoList.createTask("String 2");
		ToDoList.createTask("String 3");

		if (ToDoList.tasks.size() != 3) {
			System.out.println("Create Task test is success!!");
		} else {
			System.out.println("Create Task test is fail!!");
		}

	}

	//implement methods to test all of the methods in ToDoList class
	//implement a method called testAll to run each method in your Test class
}
