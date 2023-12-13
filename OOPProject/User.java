package OOPProject;

import java.util.Vector;

public abstract class User {
	private String login;
	private String password;
	public Language language;
	public static Vector<User> users = new Vector<User>();
	User() {
		
	}
	User(String login, String password, Language language) {
		this.login = login;
		this.password = password;
		this.language = language;
		users.add(this);
	}
	public boolean checkStatus() {
		return true;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	/*
	public Vector<News> viewNews() {
		return null;
	}*/// NE SDELANO
	public void changeLanguage(Language language) {
		this.language = language;
	}
	public String toString() {
		return "Login: " + login + ", password: " + password + ", language: " + language;
	}
}
