# Exercising-Functional-Style

# Default Methods in Java 8
   Default methods follow four rules.
   1. subtypes automatically carry over the default methods form their super types.
   2. for interfaces that contribute a default method the implementation in a subtype 
   takes precedence over the one in the super types.
   3. Implementations in classes, including abstract declarations takes precedence over 
   all the interface defaults.
   4. if ther's a confilct between two or more default method implementations, there's a 
   default-abstract conflict between two interfaces , the inherting class should disambiguate.
   
# Java 8 Method Reference
   A method reference is the shorthand syntax for a lambda expression that executes just one method. 
   Here's the general syntax of a method reference: Object :: methodName
   ** Instead of using
   AN ANONYMOUS CLASS
   you can use
   A LAMBDA EXPRESSION
   and if this just calls one method, you can use
    A METHOD REFERENCE **

# Exercise 4   
  *   List the names of files in a directory, all in uppercase , comma separated
  *   The mess of concatenating output
  *   The traditional approach 
  *   The Java 8 Solution 
# Exercise 5
  *   traditinal way of using comparable (1.2) --- https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
  *   traditinal way of using comparator (1.2) --- https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
# Exercise 6
  *   The Java 8 Solution (1.2) --- https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
# Exercise 7
  *   IntStream -->  This is the int primitive specialization of Stream.
  *   rangeClosed​(int startInclusive, int endInclusive) --> Returns a sequential ordered IntStream from startInclusive (inclusive) to endInclusive (inclusive) by an incremental step of 1
  *   filter​(IntPredicate predicate)  -->  Returns a stream consisting of the elements of this stream that match the given predicate.
  *   mapToObj​(IntFunction<? extends U> mapper) -->  Returns an object-valued Stream consisting of the results of applying the given function to the elements of this stream.
  *   collect​(Collector<? super T,​A,​R> collector) --> Performs a mutable reduction operation on the elements of this stream using a Collector.
  *   joining​(CharSequence delimiter)   ->   Returns a Collector that concatenates the input elements, separated by the specified delimiter, in encounter order
  
https://martinfowler.com/articles/collection-pipeline/

