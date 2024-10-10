package com.example.streamEx.example.problem6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    Problem6 problem6 = new Problem6();

    @Test
    void quiz1() {
        assertThat(problem6.quiz1().size()).isEqualTo(2);
        assertThat(problem6.quiz1().get(true).size()).isEqualTo(2);
        assertThat(problem6.quiz1().get(false).size()).isEqualTo(4);
    }

    @Test
    void quiz2() {
        assertThat(problem6.quiz2().size()).isEqualTo(3);
        assertThat(problem6.quiz2().get(1).size()).isEqualTo(2);
        assertThat(problem6.quiz2().get(2).size()).isEqualTo(2);
        assertThat(problem6.quiz2().get(3).size()).isEqualTo(2);
    }
}