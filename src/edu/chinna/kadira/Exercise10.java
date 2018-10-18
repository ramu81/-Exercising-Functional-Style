package edu.chinna.kadira;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise10 {

	public static void main(String[] args) {
		List<Person> lPersons = Arrays.asList(new Person("Ram", 20), new Person("Vasantha", 20), new Person("Sai", 3),
				new Person("Laxmamma", 50), new Person("Guddappa", 50), new Person("Arjun", 18));
		// Group by age
		Map<Integer, List<Person>> groupByAge = new HashMap<>();
		for (Person lPerson : lPersons) {
			groupByAge.computeIfAbsent(lPerson.getId(), temp -> new ArrayList<>());
			groupByAge.get(lPerson.getId()).add(lPerson);
		}
		System.out.println(groupByAge);
		System.out.println(lPersons.parallelStream().collect(
				groupingBy(Person::getId, mapping(Person::getName, toList()))));
	}
}
