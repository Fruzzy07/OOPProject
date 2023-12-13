package OOPProject;

import java.util.Vector;

public class Admin extends User{
	public Admin() {
		
	}
	public void add(User u) {
		users.add(u);
	}
	public boolean remove(User u) {
		return users.remove(u);
	}
	public boolean update(User u) {
		return users.size() != 0;
	}
	public Vector<User> seeLogs() {
		return users;
	}
}
