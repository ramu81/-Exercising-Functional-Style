package edu.chinna.kadira;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {

	private String name;
	private int id;

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
