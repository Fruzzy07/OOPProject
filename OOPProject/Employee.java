package OOPProject;

public abstract class Employee extends User{
	private String id;
	public String fullName;
	private int salary;
	public Employee() {
		
	}
	public Employee(String login, String password, Language language, String id, String fullName, int salary) {
		super(login, password, language);
		this.id = id;
		this.fullName = fullName;
		this.salary = salary;
	}
	public abstract String report(String s);
	public boolean dismissal() {
		return User.users.remove(this);
	}
	public abstract String sendMessage(String s);
	public String toString() {
		return super.toString() + ", id:" + id + ", full name: " + ", salary: " + salary;
	}
}
