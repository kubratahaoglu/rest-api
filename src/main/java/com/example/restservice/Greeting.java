package com.example.restservice;

public class Greeting {

	private String firstname;
	private String lastname;

	public Greeting(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getName() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
}