import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TodoList {

	private String topic;
	private ArrayList<String> tasks;

	public TodoList(String topic) {
		this.topic = topic;
		this.tasks = new ArrayList<String>();
	}

	
	//// A method to add tasks 
	public void addTask(String taskName) {
		this.tasks.add(taskName);
	}
	
	/// A method to display a To do List
	public void display() {
		if (this.tasks.size() == 0) {
			System.out.println("Our To do list for " + topic + "is empty");

		} else {
			System.out.println("Here is our To do List for " + topic);
			for (int i = 0; i < this.tasks.size(); i++) {
				System.out.println("Task " + i + " : " + this.tasks.get(i));
			}
		}
	}

	////// A method to assign task for each name and employee
	public void assignTask(String name, Date d) {

	}

	////// A method to assign the deadline for each task
	
	
	
	

	///// A method to create a task in TodoLIst

	public void createTask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter task name");
		String name = sc.nextLine();
		System.out.println("Please enter employee name");
		String empname = sc.nextLine();
		System.out.println("Please enter due date");
		System.out.println("Please enter your date in the format dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		Date d = null;
		try {
			d = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Task t = new Task();
		t.setName(name);
		t.setDeadLine(d);
		t.setEmployee(empname);
		// tasks.add(t);
		System.out.println("Task added successfully.");

	}

	////// Mark a task as done

	///// remove task
	
	public void removeTask(int i) {
		try {
			this.tasks.remove(i);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Could not remove task, check your index!!");
		}
	}

	///// rename task
	public void renametask(int i, String newTask) {
		try {
			this.tasks.set(i, newTask);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Could not rename task, check number of index");
		}
	
	}
}
