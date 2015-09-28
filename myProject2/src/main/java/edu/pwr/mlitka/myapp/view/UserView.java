package edu.pwr.mlitka.myapp.view;

public class UserView {

	private final String username;
	private final String name;
	private final String surname;

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public UserView(String username, String name, String surname) {
		super();
		this.username = username;
		this.name = name;
		this.surname = surname;
	}

}
