package edu.chinna.kadira;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TraditionalPerson implements Comparable<TraditionalPerson>, Serializable {

	private String name;
	private int id;

	public TraditionalPerson(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
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

	/**
	 * 
	 */
	@Override
	public int compareTo(TraditionalPerson lPerson) {
		return lPerson.getName().compareToIgnoreCase(this.getName());
	}

	@Override
	public String toString() {
		return "TraditionalPerson [name=" + name + ", id=" + id + "]";
	}

}
