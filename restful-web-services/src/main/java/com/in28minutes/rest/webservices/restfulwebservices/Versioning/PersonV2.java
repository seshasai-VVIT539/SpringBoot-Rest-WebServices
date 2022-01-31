package com.in28minutes.rest.webservices.restfulwebservices.Versioning;

public class PersonV2 {
	private Name name;

	public PersonV2(String firstName, String lastName) {
		super();
		this.name = new Name(firstName, lastName);
	}

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}
