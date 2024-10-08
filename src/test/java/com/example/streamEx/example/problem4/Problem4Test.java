package com.example.streamEx.example.problem4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    Problem4 problem4 = new Problem4();

    @Test
    void quiz1() {
        Trader kyu = new Trader("Kyu", "Seoul");
        Trader ming = new Trader("Ming", "Gyeonggi");
        Trader hyuk = new Trader("Hyuk", "Seoul");
        Trader hwan = new Trader("Hwan", "Busan");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(hwan, 2020, 4900),
                new Transaction(ming, 2020, 7100),
                new Transaction(kyu, 2020, 12000),
                new Transaction(ming, 2020, 40000)
        );

        assertThat(problem4.quiz1()).isEqualTo(transactions);
    }

    @Test
    void quiz2() {
        assertThat(problem4.quiz2()).contains("Seoul", "Gyeonggi", "Busan");
    }

    @Test
    void quiz3() {
        Trader kyu = new Trader("Kyu", "Seoul");
        Trader hyuk = new Trader("Hyuk", "Seoul");
        assertThat(problem4.quiz3()).contains(hyuk, kyu);
    }

    @Test
    void quiz4() {
        assertThat(problem4.quiz4()).isEqualTo("Hwan,Hyuk,Kyu,Ming");
    }

    @Test
    void quiz5() {
        assertThat(problem4.quiz5()).isTrue();
    }

    @Test
    void quiz6() {
        assertThat(problem4.quiz6()).containsExactly(30000, 12000, 5900);
    }

    @Test
    void quiz7() {
        assertThat(problem4.quiz7().length).isEqualTo(2);
        assertThat(problem4.quiz7()).containsExactly(40000, 4900);
    }

}