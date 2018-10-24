package edu.chinna.kadira;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamsExercise2 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<String> words = Arrays.asList("Ram", "Vasantha", "Laxmamma", "Sai Charan", "Chinna");
        System.out.println(words.parallelStream()
              .mapToLong(ParallelStreamsExercise2::process)
              .reduce(0,Long::sum));
        long endTime = System.currentTimeMillis();
        System.out.println("Total Execution Time : "+(endTime-startTime) +" Millis ");
    }

    private static long process(String word) {
        try {
            System.out.println("  Processing Thread "+Thread.currentThread().getName());
            Thread.sleep(1000l);
        } catch (InterruptedException exe) {
            System.err.println(exe.getMessage());
        }
        return word.length();
    }
}
