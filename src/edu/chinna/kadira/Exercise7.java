package edu.chinna.kadira;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise7 {

	public static boolean isTraditionalPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int n) {
		return n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);

	}

	public static void main(String[] args) {

		// Traditional way of writing prime numbers

		for (int i = 1; i <= 10; i++) {
			if (isTraditionalPrime(i)) {
				System.out.print(" " + i);
			}
		}
		System.out.println();

		// Java 8

		System.out.println(IntStream.rangeClosed(1, 10)
				.filter(Exercise7::isPrime)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(" ")));

	}
}
