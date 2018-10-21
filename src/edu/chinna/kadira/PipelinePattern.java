package edu.chinna.kadira;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.function.Predicate;

/**
 * Collection pipelines are a programming pattern where you organize some computation as a sequence of operations
 * which compose by taking a collection as output of one operation and feeding it into the next.
 * (Common operations are filter, map, and reduce.) This pattern is common in functional programming,
 * and also in object-oriented languages which have lambdas.
 * 
 * https://martinfowler.com/articles/collection-pipeline/
 */
public class PipelinePattern {
    public static void main(String[] args) {
        List<Person> lPersons = Arrays.asList(
                new Person("Ram",23, GENDER.MALE),
                new Person("Vasantha",23, GENDER.FEMALE),
                new Person("Sai",3, GENDER.MALE),
                new Person("Laxmamma",43, GENDER.FEMALE),
                new Person("Chinna",53, GENDER.MALE),
                new Person("Arjun",23, GENDER.MALE)
        );
        /**
         * creating predicate(s)
         */
        Predicate<Person> ageEq23 = person -> person.getAge()==23;
        Predicate<Person> isFemale = person -> person.getGender()== GENDER.FEMALE;

        System.out.println(lPersons.parallelStream()
                .filter(isFemale)
                .filter(ageEq23)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(toList()));
    }
}

enum GENDER {
    MALE,
    FEMALE
}

class Person {
    private String name;
    private Integer age;
    private GENDER gender;

    public Person(String name, Integer age, GENDER sex) {
        this.name = name;
        this.age = age;
        this.gender = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

}
