package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIs {

    public static void main(String args[]) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println("square");
        System.out.println(square);

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println("Start with S");
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted");
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println("squareSet");
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(System.out::println);

        // demonstration of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
        System.out.println(even);
        int odd = number.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
        System.out.println(odd);
        List<Integer> oddList = number.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println("oddList");
        System.out.println(oddList);
    }
}
