import java.util.Date;

public class Task {

	private String taskName;
	private Date deadLine;
	private String employee;
	private boolean isDone;

	public String getName() {
		return taskName;
	}

	public void setName(String name) {
		this.taskName = name;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	// create get and set methods for the DeadLine and Employee
	// similar to how get and set Name are created
	// pay attention to how the datatype of the variables are declared

	@Override
	public String toString() {
		return "Task name = " + taskName + " , employee = " + employee + " , deadline = " + deadLine + ", Done = " + isDone;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

}
