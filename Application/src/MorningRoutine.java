
public class MorningRoutine {
	public static void main(String[] args) 
	{
		TodoList myTodoList = new TodoList("My morning routine");
		myTodoList.addTask("Wake up");
		myTodoList.addTask("Shower");
		myTodoList.addTask("Have breakfast");
		myTodoList.addTask("Go to work");
		myTodoList.display();
		myTodoList.remove(2);
		myTodoList.display();
		myTodoList.rename(1, "Take bath");
		myTodoList.display();
	}
}

