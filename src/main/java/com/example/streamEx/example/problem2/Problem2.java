package com.example.streamEx.example.problem2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem2 {

    private static List<String> WORDS = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");

    // 2.1 List에 저장된 단어들의 접두사가 각각 몇개씩 있는지 Map<String, Integer>으로 변환하여라.
    // ex) ("T", 1), ("a", 2) ...
    public Map<String, Integer> quiz1() {
        return WORDS.stream()
                .map(w -> w.substring(0, 1)) // 문자의 첫 글자만 가져오기
                .collect(Collectors.toMap(
                        prefix -> prefix, // KEY 값
                        prefix -> 1,    // VALUE 값 1로 초기화
                        (oldValue, newValue) -> (newValue += oldValue)));   // 동일 값 존재 시 카운트 값 더하기
    }

    // 2.2 List에 저장된 단어들 중에서 단어의 길이가 2 이상인 경우에만, 모든 단어를 대문자로 변환하여 스페이스로 구분한 하나의 문자열로 합한 결과를 반환하여라.
    // ex) ["Hello", "a", "Island", "b"] -> “H I”
    public String quiz2() {
        return WORDS.stream()
                .filter(w -> w.length() > 1)    // 단어 길이 2 이상
                .map(String::toUpperCase)   // 대문자 변환
                .map(w -> w.substring(0, 1))    // 단어 첫 글자 가져오기
                .collect(Collectors.joining(" "));  // 하나의 문자로 합하기 + " "
    }
}
