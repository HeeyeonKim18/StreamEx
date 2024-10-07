package com.example.streamEx.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<Integer>> listOfInts = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
        listOfInts.stream().map(list -> list.stream()).collect(Collectors.toList());
        System.out.println("Result of Map() = " + listOfInts);

        List<Integer> flatMapResult = listOfInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("Result of flatMap() = " + flatMapResult);
    }
}
