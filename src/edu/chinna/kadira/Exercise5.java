package edu.chinna.kadira;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {

		List<Person> lPersons = Arrays.asList(new Person("Ram", 1), new Person("Vasantha", 2), new Person("Sai", 3),
				new Person("Laxmamma", 4));

		List<TraditionalPerson> lTraditionalPersons = Arrays.asList(new TraditionalPerson("Ram", 1),
				new TraditionalPerson("Vasantha", 2), new TraditionalPerson("Sai", 3),
				new TraditionalPerson("Laxmamma", 4));

		Collections.sort(lTraditionalPersons);
		Comparator<Person> ByName = new Comparator<Person>() {
			public int compare(Person a, Person b) {
				return a.getName().compareTo(b.getName());
			}
		};
		Collections.sort(lPersons, ByName);
		System.out.println();
		for (TraditionalPerson traditionalPerson : lTraditionalPersons) {
			System.out.println(traditionalPerson);
		}
		System.out.println();
		for (Person lPerson : lPersons) {
			System.out.println(lPerson);
		}
		System.out.println();
		lPersons.stream().sorted(ByName).forEach(System.out::println);
	}
}
