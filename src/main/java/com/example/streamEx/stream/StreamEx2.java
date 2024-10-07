package com.example.streamEx.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        // avoid nesting streams
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("orange", "pineapple", "mango");

        List<String> result = Stream.concat(list1.stream(), list2.stream())
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("result = " + result);

        // use lazy evaluation for better performance
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer resultInt = list.stream()
                .filter(n -> n > 3)
                .findFirst()
                .get();
        System.out.println("resultInt = " + resultInt);
        
        // use filter() before map() to avoid unnecessary processing
        List<Integer> filterResult = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println("filterResult = " + filterResult);


    }
}
