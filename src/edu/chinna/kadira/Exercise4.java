package edu.chinna.kadira;

import java.io.File;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author rakondapalli
 *
 */
public class Exercise4 {
	public static void main(String[] args) {
		File directory = new File(".");
		File childerns[] = directory.listFiles();
		if (Objects.nonNull(childerns)) {
			// The traditional approach
			for (File child : childerns) {
				System.out.print(child.getName().toUpperCase() + ", ");
			}
			System.out.println();

			for (int i = 0; i < childerns.length; i++) {
				File child = childerns[i];
				System.out.print(child.getName().toUpperCase());
				if (i != (childerns.length - 1))
					System.out.print(", ");
			}
			System.out.println();
			// The Java 8 Solution
			System.out.println(Stream.of(childerns)
					.map(File::getName)
					.map(String::toUpperCase)
					.collect(Collectors.joining(", ")));
		}
	}
}
