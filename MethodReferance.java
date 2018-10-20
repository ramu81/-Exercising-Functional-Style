package edu.chinna.kadira;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class MethodReferance {
    public static void main(String[] args) {
        List<People> thePeoples = Arrays.asList(
          new People("Ram",25),
                new People("Vasantha",22),
                new People("Sai",3),
                new People("Laxmamma",55)
        );

        thePeoples.stream().sorted(People::compareAge).forEach(System.out::println);
        thePeoples.stream().sorted(People::whosOld).forEach(System.out::println);

        List<Integer> listVal = Arrays.asList(1,2,3,4,5);

        listVal.stream().map(Object::toString).forEach(System.out::println);
    }
}

class People{

    String name ;
    Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    int compareAge(People thisPeople){
        return  this.age-thisPeople.age;
    }

    static int whosOld(People one,People two){
        return  one.age-two.age;
    }
    @Override
    public String toString(){
        return String.format(" %s %d ",name,age);
    }
}
