import java.util.ArrayList;

public class TodoList {

	private String topic;
	private ArrayList<String> tasks;

	public TodoList(String topic) {
		this.topic = topic;
		this.tasks = new ArrayList<String>();
	}

//// A method to add tasks to our to do list 
	public void addTask(String taskName) {
		this.tasks.add(taskName);
	}

//// A method to display the different tasks within our to do List	
	public void display() {
		if (this.tasks.size() == 0) {
			System.out.println("Our To do list for " + topic + "is empty");
			;
		} else {
			System.out.println("Here is our To do List for " + topic);
			for (int i=0; i<this.tasks.size(); i++) {
				System.out.println("Task " + i + " : " + this.tasks.get(i));
			}
		}
	}

////  A method to remove tasks 
	public void removeTask(int i) {
		try {
			this.tasks.remove(i);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Could not remove task, check your index!!");
		}
	}

//// A rename method 
	public void renametask(int i, String newTask) {
		try {
			this.tasks.set(i, newTask);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Could not rename task, check number of index");
		}
	}

}
