package org.lokeshdarla;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        //Stream<Integer>data=nums.stream();
        //Stream<Integer> squaredData=data.map(n->n*n);
        //squaredData.forEach(System.out::println);
        // data.forEach(n -> System.out.println(n));
        // data.forEach(n -> System.out.println(n)); // you cannot use the stream twice

        nums.stream()
                .filter(num -> num % 2 == 1)
                .sorted()
                .map(n->n*n)
                .forEach(System.out::println);

        int result = nums.stream()
                .filter(num -> num % 2 == 1)       // Keep only odd numbers
                .sorted()                          // Sort them
                .map(n -> n * n)                   // Square each number
                .reduce(0, Integer::sum);          // Sum up the results

        System.out.println("Result: " + result);

    }
}