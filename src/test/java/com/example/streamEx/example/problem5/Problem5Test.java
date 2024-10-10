package com.example.streamEx.example.problem5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    Problem5 problem5 = new Problem5();

    @Test
    void quiz1(){
        assertThat(problem5.quiz1()).isEqualTo(10);
    }

    @Test
    void quiz2(){
        assertThat(problem5.quiz2()).isEqualTo(4);
    }

    @Test
    void quiz3(){
        assertThat(problem5.quiz3().size()).isEqualTo(6);
        assertThat(problem5.quiz3()).isSorted();
    }

    @Test
    void quiz4(){
        assertThat(problem5.quiz4().size()).isEqualTo(5);
        assertThat(problem5.quiz4()).contains(new Integer[]{1,5}, new Integer[]{2,4}, new Integer[]{3,3}, new Integer[]{4,2}, new Integer[]{5,1});

    }
}