
public class MorningRoutine {

	public static void main(String[] args) {
		TodoList myTodoList = new TodoList("Monia's morning routine");
		myTodoList.addTask("Wake up, Rise and Shine !!");
		myTodoList.addTask("Wash face and brush teeth !!");
		myTodoList.addTask("Breakfast");
		myTodoList.addTask("Go to work");
		myTodoList.display();
		myTodoList.removeTask(2);
		myTodoList.display();
		myTodoList.renametask(1, "Take a shower");
		myTodoList.display();

	}

}
