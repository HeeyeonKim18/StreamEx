package com.example.streamEx.example.problem1;

import com.opencsv.exceptions.CsvException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    Problem1 problem1 = new Problem1();

    @Test
    void quiz1() throws IOException, CsvException {
        assertThat(problem1.quiz1()).containsKeys("스포츠댄스", "당구", "개발", "야구", "골프", "피아노", "농구", "축구");
        assertThat(problem1.quiz1()).hasSize(8);
        assertThat(problem1.quiz1()).containsEntry("개발", 3);
        assertThat(problem1.quiz1()).containsEntry("스포츠댄스", 1);
        assertThat(problem1.quiz1()).containsEntry("당구", 1);
        assertThat(problem1.quiz1()).containsEntry("야구", 2);
        assertThat(problem1.quiz1()).containsEntry("골프", 1);
        assertThat(problem1.quiz1()).containsEntry("피아노", 1);
        assertThat(problem1.quiz1()).containsEntry("농구", 2);
        assertThat(problem1.quiz1()).containsEntry("축구", 3);
    }

    @Test
    void quiz2() throws IOException, CsvException {
        assertThat(problem1.quiz2()).hasSize(4);
        assertThat(problem1.quiz2()).containsEntry("축구", 2);
        assertThat(problem1.quiz2()).containsEntry("당구", 1);
        assertThat(problem1.quiz2()).containsEntry("개발", 2);
        assertThat(problem1.quiz2()).containsEntry("농구", 1);
    }

    @Test
    void quiz3() throws IOException, CsvException {
        assertThat(problem1.quiz3()).isEqualTo(8);
    }

}