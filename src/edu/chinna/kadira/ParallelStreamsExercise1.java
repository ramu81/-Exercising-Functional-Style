package edu.chinna.kadira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ParallelStreamsExercise1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<String> words = Arrays.asList("Ram", "Vasantha", "Laxmamma", "Sai Charan", "Chinna");
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(10);
            List<Future<Long>> futureList = new ArrayList<>();
            for (String word : words) {
                Future future = executorService.submit(() -> process(word));
                futureList.add(future);
            }
            executorService.shutdown();
            long sum = 0;
            for (Future future : futureList) {
                sum = sum + (long) future.get();
            }
            System.out.println(sum);
            executorService.awaitTermination(50, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
