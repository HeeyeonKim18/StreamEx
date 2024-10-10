package com.example.streamEx.example.problem5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem5 {
    private static final String[] STRING_ARR = {"aaa", "bb", "c", "dddd"};

    // 5.1 모든 문자열의 길이를 더한 결과를 출력하여라.
    public int quiz1() {
        return Arrays.stream(STRING_ARR)
                .map(String::length)
                .reduce(Integer::sum).get();
    }

    // 5.2 문자열 중에서 가장 긴 것의 길이를 출력하시오.
    public int quiz2() {
        return Arrays.stream(STRING_ARR)
                .map(String::length)
                .max(Integer::compare).get();
    }

    // 5.3 임의의 로또번호(1~45)를 정렬해서 출력하시오.
    public List<Integer> quiz3() {
        return new Random().ints(1, 46)
                .distinct()
                .limit(6)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
    }

    // 5.4 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
    public List<Integer[]> quiz4() {
        return IntStream.rangeClosed(1, 6)
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(1, 6).boxed()
                        .map(j -> new Integer[]{i, j}))
                .filter(arr-> arr[0] + arr[1] == 6)
                .collect(Collectors.toList());
    }

}
